package FrameKeyEventSample;

/*キーボードが押されたときメッセージダイアログに押されたキーのキャラクター（文字）を表示するアプリケーション。
 * Swingデザイナーの導入（→爆速コーディング。てかほぼコード書かなくなるｗ）
 * これでキーイベント処理は簡単にできると思う・・・。
 * これが終わったら次はEV3のリモート処理の練習をしよう！
 */

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.SystemColor;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class KeyEventPractice extends JFrame {

	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main_frame frame = new main_frame();
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
	public main_frame() {
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				JOptionPane.showMessageDialog(rootPane, e.getKeyChar());
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JLabel lblLabel1 = new JLabel("Press Any Key ...");
		lblLabel1.setBackground(SystemColor.text);
		lblLabel1.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblLabel1, BorderLayout.CENTER);
	}

}