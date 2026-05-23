package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

@Entity
@Table(name = "subject")
@NamedQuery(name = "Subject.findAll", query = "SELECT r FROM Rol r")
public class Subject {
	
	@Id
	@Column(name = "idsubject")
	private int idsubject;
	
	@Column(name = "subjectname")
	private String subjectname;
	
	@Column(name = "subjectstatus")
	private int subjecttatus;
	
	@Column(name = "subjectteacher")
	private String subjectteacher;
	
	@Column(name = "subjectlevel")
	private String subjectlevel;

	public Subject() {
		super();
	}

	public int getIdsubject() {
		return idsubject;
	}

	public void setIdsubject(int idsubject) {
		this.idsubject = idsubject;
	}

	public String getSubjectname() {
		return subjectname;
	}

	public void setSubjectname(String subjectname) {
		this.subjectname = subjectname;
	}

	public int getSubjecttatus() {
		return subjecttatus;
	}

	public void setSubjecttatus(int subjecttatus) {
		this.subjecttatus = subjecttatus;
	}

	public String getSubjectteacher() {
		return subjectteacher;
	}

	public void setSubjectteacher(String subjectteacher) {
		this.subjectteacher = subjectteacher;
	}

	public String getSubjectlevel() {
		return subjectlevel;
	}

	public void setSubjectlevel(String subjectlevel) {
		this.subjectlevel = subjectlevel;
	}

	
}
