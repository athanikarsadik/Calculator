import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;


public class Calculator extends JFrame implements ActionListener {
    double number, answer;
    int calculation;

    JMenuBar jmb;
    JMenu jm;
    JMenuItem jmi;
    JFrame frame;
    String s0, s1, s2;
    static String check = "Standard";
    JLabel label = new JLabel();
    JTextField textField = new JTextField();
    JButton buttonZero = new JButton("0");
    JButton buttonOne = new JButton("1");
    JButton buttonTwo = new JButton("2");
    JButton buttonThree = new JButton("3");
    JButton buttonFour = new JButton("4");
    JButton buttonFive = new JButton("5");
    JButton buttonSix = new JButton("6");
    JButton buttonSeven = new JButton("7");
    JButton buttonEight = new JButton("8");
    JButton buttonNine = new JButton("9");
    JButton buttonDot = new JButton(".");
    JButton buttonClear = new JButton("C");
    JButton buttonDelete = new JButton("DEL");
    JButton buttonEqual = new JButton("=");
    JButton buttonMul = new JButton("x");
    JButton buttonDiv = new JButton("/");
    JButton buttonPlus = new JButton("+");
    JButton buttonMinus = new JButton("-");
    JButton buttonSquare = new JButton("x\u00B2");
    JButton buttonReciprocal = new JButton("1/x");
    JButton buttonSqrt = new JButton("\u221A");
    JButton buttonCloseP = new JButton("(");
    JButton buttonOpenP = new JButton(")");
    

    Calculator() {
        prepareGUI();
        addComponents();
        addActionEvent();
    }

    public void prepareGUI() {
        frame = new JFrame();
        jmb = new JMenuBar();
        jm = new JMenu("|||");
        jmi = new JMenuItem("Expression Evaluation");
        jm.add(jmi);
        jmb.add(jm);
        frame.setJMenuBar(jmb);
        jmi.addActionListener(this);
        frame.setTitle("Calculator");
        frame.setSize(300, 520);
        frame.getContentPane().setLayout(null);
        frame.getContentPane().setBackground(Color.gray);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }

    public void addComponents() {
        label.setBounds(0, 0, 250, 50);
        label.setForeground(Color.white);
        frame.add(label);

        textField.setBounds(10, 40, 270, 40);
        textField.setFont(new Font("Arial", Font.BOLD, 20));
        textField.setEditable(false);
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        frame.add(textField);

        buttonSeven.setBounds(10, 230, 60, 40);
        buttonSeven.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonSeven);

        buttonEight.setBounds(80, 230, 60, 40);
        buttonEight.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonEight);

        buttonNine.setBounds(150, 230, 60, 40);
        buttonNine.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonNine);

        buttonFour.setBounds(10, 290, 60, 40);
        buttonFour.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonFour);

        buttonFive.setBounds(80, 290, 60, 40);
        buttonFive.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonFive);

        buttonSix.setBounds(150, 290, 60, 40);
        buttonSix.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonSix);

        buttonOne.setBounds(10, 350, 60, 40);
        buttonOne.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonOne);

        buttonTwo.setBounds(80, 350, 60, 40);
        buttonTwo.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonTwo);

        buttonThree.setBounds(150, 350, 60, 40);
        buttonThree.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonThree);

        buttonDot.setBounds(150, 410, 60, 40);
        buttonDot.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonDot);

        buttonZero.setBounds(10, 410, 130, 40);
        buttonZero.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonZero);

        buttonEqual.setBounds(220, 350, 60, 100);
        buttonEqual.setFont(new Font("Arial", Font.BOLD, 20));
        buttonEqual.setBackground(new Color(239, 188, 2));
        frame.add(buttonEqual);

        buttonDiv.setBounds(220, 110, 60, 40);
        buttonDiv.setFont(new Font("Arial", Font.BOLD, 20));
        buttonDiv.setBackground(new Color(239, 188, 2));
        frame.add(buttonDiv);

        buttonSqrt.setBounds(10, 170, 60, 40);
        buttonSqrt.setFont(new Font("Arial", Font.BOLD, 18));
        frame.add(buttonSqrt);

        buttonMul.setBounds(220, 230, 60, 40);
        buttonMul.setFont(new Font("Arial", Font.BOLD, 20));
        buttonMul.setBackground(new Color(239, 188, 2));
        frame.add(buttonMul);

        buttonMinus.setBounds(220, 170, 60, 40);
        buttonMinus.setFont(new Font("Arial", Font.BOLD, 20));
        buttonMinus.setBackground(new Color(239, 188, 2));
        frame.add(buttonMinus);

        buttonPlus.setBounds(220, 290, 60, 40);
        buttonPlus.setFont(new Font("Arial", Font.BOLD, 20));
        buttonPlus.setBackground(new Color(239, 188, 2));
        frame.add(buttonPlus);

        buttonSquare.setBounds(80, 170, 60, 40);
        buttonSquare.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonSquare);

        buttonReciprocal.setBounds(150, 170, 60, 40);
        buttonReciprocal.setFont(new Font("Arial", Font.BOLD, 15));
        frame.add(buttonReciprocal);

        buttonDelete.setBounds(150, 110, 60, 40);
        buttonDelete.setFont(new Font("Arial", Font.BOLD, 12));
        buttonDelete.setBackground(Color.red);
        buttonDelete.setForeground(Color.white);
        frame.add(buttonDelete);

        buttonClear.setBounds(80, 110, 60, 40);
        buttonClear.setFont(new Font("Arial", Font.BOLD, 12));
        buttonClear.setBackground(Color.red);
        buttonClear.setForeground(Color.white);
        frame.add(buttonClear);

    }

    public void addActionEvent() {
        
        buttonClear.addActionListener(this);
        buttonDelete.addActionListener(this);
        buttonDiv.addActionListener(this);
        buttonSqrt.addActionListener(this);
        buttonSquare.addActionListener(this);
        buttonReciprocal.addActionListener(this);
        buttonMinus.addActionListener(this);
        buttonSeven.addActionListener(this);
        buttonEight.addActionListener(this);
        buttonNine.addActionListener(this);
        buttonMul.addActionListener(this);
        buttonFour.addActionListener(this);
        buttonFive.addActionListener(this);
        buttonSix.addActionListener(this);
        buttonPlus.addActionListener(this);
        buttonOne.addActionListener(this);
        buttonTwo.addActionListener(this);
        buttonThree.addActionListener(this);
        buttonEqual.addActionListener(this);
        buttonZero.addActionListener(this);
        buttonDot.addActionListener(this);
        buttonOpenP.addActionListener(this);
        buttonCloseP.addActionListener(this);

    }

    public static boolean hasPrecedence(char op1, char op2)
    {
        if (op2 == '(' || op2 == ')')
            return false;
        if ((op1 == '*' || op1 == '/') &&
            (op2 == '+' || op2 == '-'))
            return false;
        else
            return true;
    }
 
    public static double applyOp(char op,double b, double a)
    {
        switch (op)
        {
        case '+':
            return a + b;
        case '-':
            return a - b;
        case '*':
            return a * b;
        case '/':
            if (b == 0)
                throw new UnsupportedOperationException("Cannot divide by zero");
            return a / b;
        }
        return 0;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        String s = e.getActionCommand();
        if(s.equals("Expression Evaluation"))
        {
            label.setText("");
            jmi.setActionCommand("Standard");
            jmi.setText("Standard");
            check = "Expression Evaluation";
            s0 = "";
            s1 = "";
            s2 = "";
            textField.setText("");
            buttonCloseP.setBounds(10, 110, 60, 40);
            buttonCloseP.setFont(new Font("Arial", Font.BOLD, 10));
            frame.add(buttonCloseP);

            frame.remove(buttonSqrt);
            frame.revalidate();
            frame.repaint();

            buttonOpenP.setBounds(10, 170, 60, 40);
            buttonOpenP.setFont(new Font("Arial", Font.BOLD, 10));
            frame.add(buttonOpenP);
            return ;
        }
        else if(s.equals("Standard"))
        {
            label.setText("");
            jmi.setActionCommand("Standard");
            jmi.setText("Standard");
            check = "Standard";
            buttonDot.setEnabled(true);
                buttonSqrt.setEnabled(true);
                buttonSquare.setEnabled(true);
                buttonReciprocal.setEnabled(true);
            s0 = "";
            s1 = "";
            s2 = "";
            textField.setText("");
            frame.remove(buttonOpenP);
            frame.revalidate();
            frame.repaint();
            frame.remove(buttonCloseP);
            frame.revalidate();
            frame.repaint();
            frame.revalidate();
            frame.repaint();
            buttonSqrt.setBounds(10, 170, 60, 40);
            buttonSqrt.setFont(new Font("Arial", Font.BOLD, 18));
            frame.add(buttonSqrt);
            return;
        }
        if(check=="Expression Evaluation")
            {
                
                buttonDot.setEnabled(false);
                buttonSqrt.setEnabled(false);
                buttonSquare.setEnabled(false);
                buttonReciprocal.setEnabled(false);
                if ((s.charAt(0) >= '0' && s.charAt(0) <= '9') || s.charAt(0) == '.') //if number is entered
                {
                    String str = textField.getText();

                    textField.setText(str+(s.charAt(0)));
                }
                else if (s.charAt(0) == 'C') //clear textField
                {
                    s0 = s1 = s2 = "";
                    textField.setText("");
                }
                else if (source == buttonPlus) {
                    String str = textField.getText();
                    textField.setText(str+"+"); 
                } else if (source == buttonMinus) {
                    String str = textField.getText();
                    textField.setText(str+"-");
                } else if (source == buttonMul) {
                    String str = textField.getText();
                    textField.setText(str+"*");
                } else if (source == buttonDiv) {
                    String str = textField.getText();
                    textField.setText(str+"/");
                }
                else if (source == buttonOpenP) {
                    String str = textField.getText();
                    textField.setText(str+")");
                }
                else if (source == buttonCloseP) {
                    String str = textField.getText();
                    textField.setText(str+"(");
                }
                else if (source == buttonDelete) {
                    int length = textField.getText().length();
                    int number = length - 1;
        
                    if (length > 0) {
                        StringBuilder back = new StringBuilder(textField.getText());
                        back.deleteCharAt(number);
                        textField.setText(back.toString());
        
                    }
                    if (textField.getText().endsWith("")) {
                        label.setText("");
                    }
                }
                else if(s.charAt(0) == '=')
                {
                String exp = textField.getText();            
                    char[] tokens = exp.toCharArray();
    
                    // Stack for numbers: 'values'
                    Stack<Double> values = new Stack<Double>();
            
                    // Stack for Operators: 'ops'
                    Stack<Character> ops = new Stack<Character>();
            
                    for (int i = 0; i < tokens.length; i++)
                    {
                        if (tokens[i] >= '0' && tokens[i] <= '9')
                        {
                            StringBuffer sbuf = new StringBuffer();

                            while (i < tokens.length && tokens[i] >= '0' && tokens[i] <= '9')
                                sbuf.append(tokens[i++]);

                            values.push(Double.parseDouble(sbuf.toString()));
                            i--;
                        }

                        else if (tokens[i] == '(')
                            ops.push(tokens[i]);
            
                        else if (tokens[i] == ')')
                        {
                            while (ops.peek() != '(')
                                values.push(applyOp(ops.pop(),values.pop(),values.pop()));
                            ops.pop();
                        }
            
                        else if (tokens[i] == '+' || tokens[i] == '-' || tokens[i] == '*' || tokens[i] == '/')
                        {
                            while (!ops.empty() && hasPrecedence(tokens[i],ops.peek()))
                                values.push(applyOp(ops.pop(),values.pop(),values.pop()));
                            ops.push(tokens[i]);
                        }
                    }
            
                    while (!ops.empty())
                        values.push(applyOp(ops.pop(),values.pop(),values.pop()));
                    textField.setText(Double.toString(values.pop()));
                }
                return;
            }
        if (source == buttonClear) {
            label.setText("");
            textField.setText("");
        } else if (source == buttonDelete) {
            int length = textField.getText().length();
            int number = length - 1;

            if (length > 0) {
                StringBuilder back = new StringBuilder(textField.getText());
                back.deleteCharAt(number);
                textField.setText(back.toString());

            }
            if (textField.getText().endsWith("")) {
                label.setText("");
            }
        } 
        else if (source == buttonZero) {
            if (textField.getText().equals("0")) {
                return;
            } else {
                textField.setText(textField.getText() + "0");
            }
        } else if (source == buttonOne) {
            textField.setText(textField.getText() + "1");
        } else if (source == buttonTwo) {
            textField.setText(textField.getText() + "2");
        } else if (source == buttonThree) {
            textField.setText(textField.getText() + "3");
        } else if (source == buttonFour) {
            textField.setText(textField.getText() + "4");
        } else if (source == buttonFive) {
            textField.setText(textField.getText() + "5");
        } else if (source == buttonSix) {
            textField.setText(textField.getText() + "6");
        } else if (source == buttonSeven) {
            textField.setText(textField.getText() + "7");
        } else if (source == buttonEight) {
            textField.setText(textField.getText() + "8");
        } else if (source == buttonNine) {
            textField.setText(textField.getText() + "9");
        } else if (source == buttonDot) {
            if (textField.getText().contains(".")) {
                return;
            } else {
                textField.setText(textField.getText() + ".");
            }

        } else if (source == buttonPlus) {
            String str = textField.getText();
            number = Double.parseDouble(textField.getText());
            textField.setText("");
            label.setText(str + "+");
            calculation = 1;
        } else if (source == buttonMinus) {
            String str = textField.getText();
            number = Double.parseDouble(textField.getText());
            textField.setText("");
            label.setText(str + "-");
            calculation = 2;
        } else if (source == buttonMul) {
            String str = textField.getText();
            number = Double.parseDouble(textField.getText());
            textField.setText("");
            label.setText(str + "X");
            calculation = 3;
        } else if (source == buttonDiv) {
            String str = textField.getText();
            number = Double.parseDouble(textField.getText());
            textField.setText("");
            label.setText(str + "/");
            calculation = 4;
        } else if (source == buttonSqrt) {
            number = Double.parseDouble(textField.getText());
            Double sqrt = Math.sqrt(number);
            textField.setText(Double.toString(sqrt));

        } else if (source == buttonSquare) {
            String str = textField.getText();
            number = Double.parseDouble(textField.getText());
            double square = Math.pow(number, 2);
            String string = Double.toString(square);
            if (string.endsWith(".0")) {
                textField.setText(string.replace(".0", ""));
            } else {
                textField.setText(string);
            }
            label.setText("(sqr)" + str);
        } else if (source == buttonReciprocal) {
            number = Double.parseDouble(textField.getText());
            double reciprocal = 1 / number;
            String string = Double.toString(reciprocal);
            if (string.endsWith(".0")) {
                textField.setText(string.replace(".0", ""));
            } else {
                textField.setText(string);
            }
        } else if (source == buttonEqual) {
            switch (calculation) {
                case 1:
                    answer = number + Double.parseDouble(textField.getText());
                    if (Double.toString(answer).endsWith(".0")) {
                        textField.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                        textField.setText(Double.toString(answer));
                    }
                    label.setText("");
                    break;
                case 2:
                    answer = number - Double.parseDouble(textField.getText());
                    if (Double.toString(answer).endsWith(".0")) {
                        textField.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                        textField.setText(Double.toString(answer));
                    }
                    label.setText("");
                    break;
                case 3:
                    answer = number * Double.parseDouble(textField.getText());
                    if (Double.toString(answer).endsWith(".0")) {
                        textField.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                        textField.setText(Double.toString(answer));
                    }
                    label.setText("");
                    break;
                case 4:
                    answer = number / Double.parseDouble(textField.getText());
                    if (Double.toString(answer).endsWith(".0")) {
                        textField.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                        textField.setText(Double.toString(answer));
                    }
                    label.setText("");
                    break;
            }
        }
    }
}
