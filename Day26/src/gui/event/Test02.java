package gui.event;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class Window02 extends Frame{
	//��ġ�� �������(������Ʈ)�� ����ʵ�� ������ �� ���
	private Panel p = new Panel();
	private BorderLayout border = new BorderLayout();
	private GridLayout grid = new GridLayout(1, 2);
	
	private Label label = new Label("�̿� ����� ���� �Ͻʴϱ�?");
	private Button yes = new Button ("��");
	private Button no = new Button("�ƴϿ�");
	
	private MouseListener listener = new MouseListener() {
		
		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mouseExited(MouseEvent e) {
			if(e.getComponent().getName().equals("button0")){
				yes.setBackground(Color.LIGHT_GRAY);
			}else if(e.getComponent().getName().equals("button1")){
				no.setBackground(Color.LIGHT_GRAY);
			}
			
		}
		
		@Override
		public void mouseEntered(MouseEvent e) {
			if(e.getComponent().getName().equals("button0")){
				yes.setBackground(Color.YELLOW);
			}else if(e.getComponent().getName().equals("button1")){
				no.setBackground(Color.YELLOW);
			}
			
			
		}
		
		@Override
		public void mouseClicked(MouseEvent e) {
			yes.setEnabled(false);
			no.setEnabled(false);
			label.setText("ó���� �Ϸ� �Ǿ����ϴ�.");
			
		}
	};
	
	
	
	//main�� �ϴ� �������� �����ڿ��� ����
	public Window02() {
		this.display();//ȭ�� ���� ���� ó��
		this.event();//�̺�Ʈ ���� ó��
		this.menu();//�޴� ���� ó��
		
		this.setTitle("GUI�׽�Ʈ");
		this.setSize(500, 400);
		this.setLocation(100, 100);
		this.setResizable(false);
		this.setVisible(true);
	}

	private void display() {
		this.setLayout(border);
		
		this.setBackground(new Color(255,255,198));
		this.add(label,BorderLayout.CENTER);
		label.setFont(new Font("", Font.BOLD, 25));
		this.add(p, BorderLayout.SOUTH);
		p.setLayout(grid);
		yes.setFont(new Font("", Font.BOLD,50));
		no.setFont(new Font("", Font.BOLD,50));
		yes.setBackground(Color.LIGHT_GRAY);
		no.setBackground(Color.LIGHT_GRAY);
		p.add(yes);
		p.add(no);
	}

	private void event() {
		
		yes.addMouseListener(listener);
		no.addMouseListener(listener);
	}

	private void menu() {
		
	}
}

public class Test02 {
	public static void main(String[] args) {
		//â�� ���̻� ���� ������ �ʰ� Ȯ���Ų Ŭ������ �ν��Ͻ��� ����
		Window02 window = new Window02();
	}
}
