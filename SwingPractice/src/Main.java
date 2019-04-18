import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Main extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		setTitle("Controller");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JLabel lblUpArrow = new JLabel("↑");
		lblUpArrow.setFont(new Font("Lucida Grande", Font.PLAIN, 64));
		lblUpArrow.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblUpArrow, BorderLayout.NORTH);

		JLabel lblRightArrow = new JLabel("→");
		lblRightArrow.setHorizontalAlignment(SwingConstants.CENTER);
		lblRightArrow.setFont(new Font("Lucida Grande", Font.PLAIN, 64));
		contentPane.add(lblRightArrow, BorderLayout.EAST);

		JLabel lblDownArrow = new JLabel("↓");
		lblDownArrow.setHorizontalAlignment(SwingConstants.CENTER);
		lblDownArrow.setFont(new Font("Lucida Grande", Font.PLAIN, 64));
		contentPane.add(lblDownArrow, BorderLayout.SOUTH);

		JLabel lblLeftArrow = new JLabel("←");
		lblLeftArrow.setHorizontalAlignment(SwingConstants.CENTER);
		lblLeftArrow.setFont(new Font("Lucida Grande", Font.PLAIN, 64));
		contentPane.add(lblLeftArrow, BorderLayout.WEST);

		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				//変数宣言
				int Key_Code = e.getKeyCode();//Switch文用
				String Key_Name = "";//コンソール表示用
				//Key_Codeによってスイッチ
				switch(Key_Code) {
				//押されたキーが『↑』なら画面上の上矢印の色を『赤』に
				case KeyEvent.VK_UP:
					Key_Name = "UP";
					lblUpArrow.setForeground(new Color(255,0,0));
					/***
					 * ここでモーターを回す
					 * ***/
					break;
				//押されたキーが『↓』なら画面上の上矢印の色を『赤』に
				case KeyEvent.VK_DOWN:
					Key_Name = "DOWN";
					lblDownArrow.setForeground(new Color(255,0,0));
					/***
					 * ここでモーターを回す
					 * ***/
					break;
				//押されたキーが『←』なら画面上の上矢印の色を『赤』に
				case KeyEvent.VK_LEFT:
					Key_Name = "LEFT";
					lblLeftArrow.setForeground(new Color(255,0,0));
					/***
					 * ここでモーターを回す
					 * ***/
					break;
				//押されたキーが『→』なら画面上の上矢印の色を『赤』に
				case KeyEvent.VK_RIGHT:
					Key_Name = "RIGHT";
					lblRightArrow.setForeground(new Color(255,0,0));
					/***
					 * ここでモーターを回す
					 * ***/
					break;
				default:
					Key_Name = "other";
					/***
					 * それ以外のキーが押された時の処理
					 * ***/
				}

				//コンソールに『Key_Name』の値を表示
				System.out.println( Key_Name + " Key Pressed.");
			}
			@Override
			public void keyReleased(KeyEvent e) {
				//変数宣言
				int Key_Code = e.getKeyCode();//Switch文用
				String Key_Name = "";//コンソール表示用

				switch(Key_Code) {
				//話されたキーが『↑』なら文字色を黒に
				case KeyEvent.VK_UP:
					Key_Name = "UP";
					lblUpArrow.setForeground(new Color(0,0,0));
					/***
					 * ここでモーターをストップ
					 * ***/
					break;
				//話されたキーが『↓』なら文字色を黒に
				case KeyEvent.VK_DOWN:
					Key_Name = "DOWN";
					lblDownArrow.setForeground(new Color(0,0,0));
					/***
					 * ここでモーターをストップ
					 * ***/
					break;
				//話されたキーが『←』なら文字色を黒に
				case KeyEvent.VK_LEFT:
					Key_Name = "LEFT";
					lblLeftArrow.setForeground(new Color(0,0,0));
					/***
					 * ここでモーターをストップ
					 * ***/
					break;
				//話されたキーが『→』なら文字色を黒に
				case KeyEvent.VK_RIGHT:
					Key_Name = "RIGHT";
					lblRightArrow.setForeground(new Color(0,0,0));
					/***
					 * ここでモーターをストップ
					 * ***/
					break;
				default:
					Key_Name = "other";
					/***
					 * それ以外のキーが押された時の処理
					 * ***/
				}

				//コンソールに『Key_Name』の値を表示
				System.out.println( Key_Name + " Key Released.");
			}
		});
	}
}
