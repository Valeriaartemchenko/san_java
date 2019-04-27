import java.awt.Color;
        import java.awt.Font;
        import java.awt.Insets;
        import java.awt.KeyEventDispatcher;
        import java.awt.KeyboardFocusManager;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;
        import java.awt.event.KeyEvent;
        import javax.script.ScriptEngine;
        import javax.script.ScriptEngineManager;
        import javax.script.ScriptException;
        import javax.swing.JButton;
        import javax.swing.JFrame;
        import javax.swing.JTextField;




public class MyCalculator
{
    public JFrame window = new JFrame("Calculator");
    public JTextField imput = new JTextField();


    public MyCalculator()
    {

        window.setSize(520, 450); // перше ширина потім висота вікна
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(new java.awt.Color(153, 204, 204)); // колір вікна
        window.setLayout(null);
        window.setResizable(false);
        window.setLocationRelativeTo(null);

        enter_area();
        month_button();

        window.setVisible(true);
    }

    private void enter_area()
    {
        imput.setFont(new Font("Arial", Font.BOLD, 24));
        imput.setBounds(16, 10, 480, 36);//ширина смуги для вводу цифр
        imput.setBackground(Color.white);	// колір смуги
        imput.setHorizontalAlignment(JTextField.RIGHT);

        window.add(imput);

        KeyboardFocusManager manager = KeyboardFocusManager.getCurrentKeyboardFocusManager();
        manager.addKeyEventDispatcher((KeyEventDispatcher) new KeyDispatcher());
    }


    class KeyDispatcher implements KeyEventDispatcher
    {
        public boolean dispatchKeyEvent(KeyEvent e)
        {
            if (e.getKeyCode() == KeyEvent.VK_ENTER)
            {
                result();
            }

            if(e.getKeyCode() == KeyEvent.VK_ESCAPE)
            {
                imput.setText("");
            }

            return false;
        }
    }


    private void month_button()
    {
        int num = 0;
        String arr[] = {"1","2","3","С","4","5","6","-","7","8","9","*","0",".","+","/","(",")","=", "Math.cos(", "Math.sin(","Math.sqrt(","Math.tan(", "Math.pow( ,",}; // команди потрібно писати кодом щоб програма розуміла
        JButton[] jbutton_n = new JButton[arr.length];

        for (int e = 0; e < 6; e++)// кількість ячейок у висоту
        {
            for (int r = 0; r < 4; r++)// кількість ячейок у ширину
            {
                jbutton_n[num] = new JButton();
                jbutton_n[num].setFont(new Font("Arial", Font.PLAIN, 20));
                jbutton_n[num].setText(arr[num]);

                jbutton_n[num].setMargin(new Insets(0,0,0,0));
                if (num < arr.length - 1)
                {
                    jbutton_n[num].setBounds(16+r*120, 55+e*62, 120, 60); // перше ширина потім висота кнопок
                }								//120 це відстань між кнопками
                else
                {
                    jbutton_n[num].setBounds(16+r*120, 55+e*62, 122, 60);
                }								//120 це відстань між кнопками
                jbutton_n[num].setFocusable(false);

                window.add(jbutton_n[num]);

                ActionListener num_button = new GoNumListener();
                jbutton_n[num].addActionListener(num_button);

                if (num < arr.length - 1)
                {
                    num++;
                }
                else
                {
                    break;
                }
            }
        }
    }

    public class GoNumListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            String name = ((JButton)e.getSource()).getText();
            if (name == "=" || name == "С")
            {

            }
            else
            {
                imput.setText(imput.getText()+name);
            }
            if (name == "=")
            {
                result();
            }
            if (name == "С")
            {
                imput.setText("");
            }


            window.repaint();
        }
    }


    private void result()
    {
        ScriptEngineManager factory = new ScriptEngineManager();
        ScriptEngine engine = factory.getEngineByName("JavaScript");
        try
        {
            imput.setText("" + engine.eval(imput.getText()));
        }
        catch (ScriptException e1)
        {

        }
    }

    public static void main(String[] args)
    {
        new MyCalculator();
    }
}