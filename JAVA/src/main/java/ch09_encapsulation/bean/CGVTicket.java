package ch09_encapsulation.bean;

public class CGVTicket {

	public static void main(String[] args) {
		CGV cgv = new CGV("ȫ��", "���˵���", "2024-05-08", "L15");
		System.out.println("Ƽ�Ϲ�ȣ: " + cgv.getTicketNum());
		System.out.println("�����: " + cgv.getTheatre());
		System.out.println("��ȭ��: " + cgv.getMovie());
		System.out.println("���Ͻ�: " + cgv.getDate());
		System.out.println("�¼���ȣ: " + cgv.getSeatNum());
	}

}
