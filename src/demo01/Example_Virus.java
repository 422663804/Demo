package demo01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileOutputStream;

public class Example_Virus extends JFrame {
    private Example_Virus jf = this;
    JTextArea Demo05 = new JTextArea();
    int sum = 0;

    public Example_Virus() {
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JPanel jp = new JPanel();
        jf.add(jp);
        JButton jButton = new JButton("扫描");
        JButton jButton2 = new JButton("删除");
        Container contentPane = this.getContentPane();
        contentPane.setLayout(null);
        contentPane.add(jButton);
        contentPane.add(jButton2);
        JLabel jLabel = new JLabel("输入指定打印日志信息路径:");
        JLabel jLabel2 = new JLabel("输入扫描病毒的文件夹路径：");
        JTextField jTextArea = new JTextField(15);
        JTextField jTextArea2 = new JTextField(20);
        contentPane.add(jLabel);
        contentPane.add(jTextArea);
        contentPane.add(jLabel2);
        contentPane.add(jTextArea2);


        JScrollPane jsp = new JScrollPane(Demo05);
        jsp.setBounds(200, 120, 600, 300);
        jsp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        jsp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        contentPane.add(jsp);

        //扫描
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (jTextArea.getText().length() <= 0 || jTextArea2.getText().length() <= 0) {
                    JDialog jDialog = new JDialog(jf, "温馨提示", true);
                    jDialog.setLayout(new BorderLayout());
                    jDialog.add(new JButton("请输入文件夹路径"));
                    jDialog.setBounds(600, 300, 200, 100);
                    jDialog.setVisible(true);
                    contentPane.add(jDialog);
                    return;
                }
                String path = jTextArea.getText();
                File file = new File(path);
                File[] files = file.listFiles();
                StringBuffer stringBuffer = new StringBuffer();
                for (File file1 : files) {
                    int sum = new Example_Virus().listall(file);
                    System.out.println("一共找到" + sum + "个文件");
                }
            }
        });

        //删除
        jButton2.addActionListener(new AbstractAction() {

            public void actionPerformed(ActionEvent e) {
                if (jTextArea.getText().length() <= 0 || jTextArea2.getText().length() <= 0) {
                    JDialog jDialog = new JDialog(jf, "温馨提示", true);
                    jDialog.setLayout(new BorderLayout());
                    jDialog.add(new JButton("请扫描后再删除"));
                    jDialog.setBounds(600, 300, 200, 100);
                    jDialog.setVisible(true);
                    contentPane.add(jDialog);
                    return;
                }
                //获取输入的路径
                String path = jTextArea2.getText();
                File file = new File(path);
                File[] files = file.listFiles();
                StringBuffer stringBuffer = new StringBuffer();
                for (File file1 : files) {
                    String outInfo = "-------------------------------------------------------------------------------------------------------" +
                            "\n文件名:" + file1.getName() + "      " +
                            "文件大小:" + file1.length() / 1024 / 1024 + "MB" + "      " +
                            " 路径：" + file1.getPath() + "      " +
                            "是否病毒文件:" + (file1.getName().endsWith("exe") ? "是" : "不是") + "      " +
                            " 删除状态:" + (file1.getName().endsWith("exe") ? "已删除" : "未删除") + "      " +
                            (file1.getName().endsWith("exe") ? file1.delete() ? "" : "" : "");
                    System.out.println(outInfo);
                    stringBuffer.append(outInfo);
                }

                try {
                    String s = jTextArea.getText() + "/log.txt";
                    FileOutputStream outputStream = new FileOutputStream(s);
                    outputStream.write(stringBuffer.toString().getBytes());
                    outputStream.flush();
                    outputStream.close();
                } catch (Exception fileNotFoundException) {
                    System.err.println("未指定路径");
                }
            }
        });
        //选择文件
        Button btn3 = new Button("添加文件");
        btn3.setBounds(400, 80, 80, 20);
        jf.add(btn3);
        btn3.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                JFileChooser chooser = new JFileChooser();
                chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
                chooser.showDialog(new JLabel(), "选择文件");
                File file = chooser.getSelectedFile();
                jTextArea2.setText(file.getAbsoluteFile().toString());
            }
        });

        this.setBounds(500, 200, 1000, 500);
        this.setVisible(true);
        this.setTitle("简易杀毒软件");
        this.setLayout(new FlowLayout());
    }

    protected int listall(File file) {
        // TODO Auto-generated method stub
        return 0;
    }

    private ActionListener AbstractAction() {
        // TODO Auto-generated method stub
        return null;
    }

    public static void main(String[] args) {
        new Example_Virus();
    }
}
