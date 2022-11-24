package util;

import java.time.LocalDateTime;
import java.util.Vector;

import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableModel;

import models.Member;

public class Sample {
	
	public static Vector<String> getMemberName(){
		//칼럼 데이터
		Vector<String> memberName = new Vector<>();
		memberName.add("ID");
		memberName.add("USERNAME");
		memberName.add("PASSWORD");
		memberName.add("NAME");
		memberName.add("EMAIL");
		memberName.add("PHONE");
		memberName.add("CREATEDATE");
		
		return memberName;
	}
	
	public static Vector<Member> getMembers(){
		//Member 데이터
		Vector<Member> members = new Vector<>();
		members.add(new Member(1,"a101","1212","염정호","a101@test.com", "01022223333", Time.localDateTimeToTimeStamp(LocalDateTime.now())));
		members.add(new Member(2,"a102","1212","유영준","a102@test.com", "0103334444", Time.localDateTimeToTimeStamp(LocalDateTime.now())));
		members.add(new Member(3,"a103","1212","서의진","a103@test.com", "01044443333", Time.localDateTimeToTimeStamp(LocalDateTime.now())));
		members.add(new Member(4,"a104","1212","김승진","a104@test.com", "01077778888", Time.localDateTimeToTimeStamp(LocalDateTime.now())));
		
		return members;
	}
}