package project.project3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

class SaoLeiConstant {
	final int row = 20;// 行数30
	final int col = 20;// 列数30
	final int LEICODE = 10;// 定义雷下方的数字
	protected int temp = 20;
	protected int leiCount = temp;// 雷数30
}

public class Swing1 implements MouseListener, ActionListener {
	JPanel p = new JPanel();
	JFrame frame = new JFrame("扫雷");
	@SuppressWarnings("rawtypes")
	JComboBox combobox = new JComboBox();
	JButton reset = new JButton("重新开始");
	Container container = new Container();

	// 游戏数据结构
	SaoLeiConstant constant = new SaoLeiConstant();
	JButton[][] buttons = new JButton[constant.row][constant.col];// 定义按钮
	int[][] counts = new int[constant.row][constant.col];// 定义整型数组保存按钮下方雷数

	// 创建构造方法
	public Swing1() {
		// 显示窗口
		frame.setSize(600, 700);// 600*700
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());

		// 添加重来、选择难度按钮
		addtopButton();

		// 添加雷区按钮
		addButtons();

		// 埋雷
		addLei();

		// 添加雷的计数
		calcNeiboLei();

		frame.setVisible(true);
	}

	void addtopButton() {
		p.removeAll();
		p.add(reset);
		reset.setBackground(Color.green);
		reset.setOpaque(true);
		reset.addActionListener(this);
		// combobox.addItem("选择难度");
		combobox.addItem("新手难度");
		combobox.addItem("初级难度");
		combobox.addItem("中级难度");
		combobox.addItem("高级难度");
		combobox.addItem("大师难度");
		combobox.setBackground(Color.GREEN);
		combobox.setOpaque(true);
		combobox.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				String item = e.getItem().toString();
				if (item.equals("新手难度")) {
					constant.leiCount = 20;
					resetGame();
				} else if (item.equals("初级难度")) {
					constant.leiCount = 43;
					resetGame();
				} else if (item.equals("中级难度")) {
					constant.leiCount = 63;
					resetGame();
				} else if (item.equals("高级难度")) {
					constant.leiCount = 99;
					resetGame();
				} else if (item.equals("大师难度")) {
					constant.leiCount = 119;
					resetGame();
				}

			}

		});
		p.add(combobox);
		frame.add(p, BorderLayout.NORTH);
		// p.add(new Label("总雷数:"+constant.leiCount,Label.CENTER));
		// p.add(new Label("总雷数:"+constant.leiCount,Label.RIGHT));
	}

	/**
	 * 埋雷
	 */
	void addLei() {
		Random rand = new Random();
		int randRow, randCol;
		for (int i = 0; i < constant.leiCount; i++) {
			randRow = rand.nextInt(constant.row);
			randCol = rand.nextInt(constant.col);
			if (counts[randRow][randCol] == constant.LEICODE) {
				i--;
			} else {
				counts[randRow][randCol] = constant.LEICODE;
			}
		}
	}

	void addButtons() {
		frame.add(container, BorderLayout.CENTER);
		container.setLayout(new GridLayout(constant.row, constant.col));
		for (int i = 0; i < constant.row; i++) {
			for (int j = 0; j < constant.col; j++) {
				JButton button = new JButton();
				button.setBackground(Color.white);
				button.setOpaque(true);
				button.addActionListener(this);
				button.addMouseListener((MouseListener) this);
				buttons[i][j] = button;
				container.add(button);
			}
		}
	}

	void calcNeiboLei() {
		int count;
		for (int i = 0; i < constant.row; i++) {
			for (int j = 0; j < constant.col; j++) {
				count = 0;
				if (counts[i][j] == constant.LEICODE)
					continue;
				if (i > 0 && j > 0 && counts[i - 1][j - 1] == constant.LEICODE)
					count++;
				if (i > 0 && counts[i - 1][j] == constant.LEICODE)
					count++;
				if (i > 0 && j < 19 && counts[i - 1][j + 1] == constant.LEICODE)
					count++;
				if (j > 0 && counts[i][j - 1] == constant.LEICODE)
					count++;
				if (j < 19 && counts[i][j + 1] == constant.LEICODE)
					count++;
				if (i < 19 && j > 0 && counts[i + 1][j - 1] == constant.LEICODE)
					count++;
				if (i < 19 && counts[i + 1][j] == constant.LEICODE)
					count++;
				if (i < 19 && j < 19 && counts[i + 1][j + 1] == constant.LEICODE)
					count++;
				counts[i][j] = count;
				buttons[i][j].setMargin(new Insets(0, 0, 0, 0));// 让按钮随按钮上的图案变化
				// buttons[i][j].setText(counts[i][j] + "");
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		JButton button = (JButton) e.getSource();
		if (button.equals(reset)) {
			resetGame();// 重新开始游戏
		} else {
			int count = 0;
			for (int i = 0; i < constant.row; i++) {
				for (int j = 0; j < constant.col; j++) {
					if (button.equals(buttons[i][j])) {
						count = counts[i][j];
						if (count == constant.LEICODE) {
							loseGame();
						} else {
							openCell(i, j);
							checkWin();
						}
						return;
					}
				}
			}
		}
	}

	public void mouseClicked(MouseEvent e) {
		JButton button = (JButton) e.getSource();
		if (e.getButton() == MouseEvent.BUTTON3) {// 判断鼠标右击动作
			for (int i = 0; i < constant.row; i++) {
				for (int j = 0; j < constant.col; j++) {
					if (button.equals(buttons[i][j])) {
						if ((buttons[i][j].isEnabled() == true)) {
							// buttons[i][j].setEnabled(false);
							buttons[i][j].setMargin(new Insets(0, 0, 0, 0));// 让按钮随按钮上的图案变化
							buttons[i][j].setText("？");
							return;
						}
					}
				}
			}
		}
	}

	/**
	 * 重新开始
	 */
	void resetGame() {
		for (int i = 0; i < constant.row; i++) {
			for (int j = 0; j < constant.col; j++) {
				buttons[i][j].setText("");
				buttons[i][j].setEnabled(true);
				buttons[i][j].setBackground(Color.white);
				counts[i][j] = 0;
			}
		}
		addLei();
		calcNeiboLei();
	}

	/**
	 * 检查是否赢了
	 */
	void checkWin() {
		for (int i = 0; i < constant.row; i++) {
			for (int j = 0; j < constant.col; j++) {
				if (buttons[i][j].isEnabled() && counts[i][j] != constant.LEICODE)
					return;
			}
		}
		JOptionPane.showMessageDialog(frame, "Yeah,你赢了！");
	}

	// 使用递归方法打开格子
	void openCell(int i, int j) {
		if (!buttons[i][j].isEnabled())
			return;
		buttons[i][j].setBackground(Color.yellow);
		buttons[i][j].setOpaque(true);
		buttons[i][j].setEnabled(false);
		if (counts[i][j] == 0) {
			if (i > 0 && j > 0 && counts[i - 1][j - 1] != constant.LEICODE)
				openCell(i - 1, j - 1);
			if (i > 0 && j < 19 && counts[i - 1][j] != constant.LEICODE)
				openCell(i - 1, j);
			if (i > 0 && j < 19 && counts[i - 1][j + 1] != constant.LEICODE)
				openCell(i - 1, j + 1);
			if (j > 0 && counts[i][j - 1] != constant.LEICODE)
				openCell(i, j - 1);
			if (j < 19 && counts[i][j + 1] != constant.LEICODE)
				openCell(i, j + 1);
			if (i < 19 && j > 0 && counts[i + 1][j - 1] != constant.LEICODE)
				openCell(i + 1, j - 1);
			if (i < 19 && counts[i + 1][j] != constant.LEICODE)
				openCell(i + 1, j);
			if (i < 19 && j < 19 && counts[i + 1][j + 1] != constant.LEICODE)
				openCell(i + 1, j + 1);
		} else {
			buttons[i][j].setMargin(new Insets(0, 0, 0, 0));
			buttons[i][j].setText(counts[i][j] + "");
		}
	}

	/**
	 * 输了,标记出雷的位置
	 */
	void loseGame() {
		for (int i = 0; i < constant.row; i++) {
			for (int j = 0; j < constant.col; j++) {
				int count = counts[i][j];
				if (count == constant.LEICODE) {
					buttons[i][j].setMargin(new Insets(0, 0, 0, 0));
					buttons[i][j].setText("雷");
					buttons[i][j].setBackground(Color.red);
					buttons[i][j].setEnabled(false);
				} else {
					buttons[i][j].setMargin(new Insets(0, 0, 0, 0));
					buttons[i][j].setText(count + "");
					buttons[i][j].setEnabled(false);

				}
			}
		}
		JOptionPane.showMessageDialog(frame, "error,你输了！");
	}

	public static void main(String[] args) {
		new Swing1();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}
}