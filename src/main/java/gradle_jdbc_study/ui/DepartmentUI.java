package gradle_jdbc_study.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import gradle_jdbc_study.dao.DepartmentDao;
import gradle_jdbc_study.daoimpl.DepartmentDaoImpl;
import gradle_jdbc_study.dto.Department;
import gradle_jdbc_study.ui.content.PanelDepartment;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class DepartmentUI extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnCancle;
	private PanelDepartment pDept;
	private JButton btnAdd;
	
	private DepartmentDao dao;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DepartmentUI frame = new DepartmentUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public DepartmentUI() {
		dao = new DepartmentDaoImpl();
		initComponents();
	}
	private void initComponents() {
		setTitle("DEPARTMENT");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		pDept = new PanelDepartment();
		contentPane.add(pDept, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		
		btnAdd = new JButton("추가");
		btnAdd.addActionListener(this);
		panel.add(btnAdd);
		
		btnCancle = new JButton("취소");
		btnCancle.addActionListener(this);
		panel.add(btnCancle);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnAdd) {
			actionPerformedBtnAdd(e);
		}
		if (e.getSource() == btnCancle) {
			actionPerformedBtnCancle(e);
		}
	}
	
	protected void actionPerformedBtnCancle(ActionEvent e) {
		pDept.clearTf();
	}
	
	protected void actionPerformedBtnAdd(ActionEvent e) {
		Department newDept = pDept.getDepartmnet();
		int res;
		
		try {
			res = dao.insertDepartment(newDept);
			if(res != -1) {
				JOptionPane.showMessageDialog(null, String.format("%s 부서가 추가되었습니다.", newDept.getDeptName()));
				pDept.clearTf();
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
	}
}
