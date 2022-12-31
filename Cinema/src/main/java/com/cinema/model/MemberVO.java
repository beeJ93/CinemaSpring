package com.cinema.model;

import java.util.Date;

public class MemberVO {
	private int mem_code, mem_email_rec, mem_phone_rec, mem_gender, mem_point, mem_lev;
	private String mem_userid, mem_password, mem_username, mem_nickname, mem_birth, mem_email, mem_phone, mem_zipcode, mem_address1, mem_address2, mem_profile, mem_photo;	
	private Date mem_reg;
	
	public int getMem_code() {
		return mem_code;
	}
	public void setMem_code(int mem_code) {
		this.mem_code = mem_code;
	}
	public int getMem_email_rec() {
		return mem_email_rec;
	}
	public void setMem_email_rec(int mem_email_rec) {
		this.mem_email_rec = mem_email_rec;
	}
	public int getMem_phone_rec() {
		return mem_phone_rec;
	}
	public void setMem_phone_rec(int mem_phone_rec) {
		this.mem_phone_rec = mem_phone_rec;
	}
	public int getMem_gender() {
		return mem_gender;
	}
	public void setMem_gender(int mem_gender) {
		this.mem_gender = mem_gender;
	}
	public int getMem_point() {
		return mem_point;
	}
	public void setMem_point(int mem_point) {
		this.mem_point = mem_point;
	}
	public int getMem_lev() {
		return mem_lev;
	}
	public void setMem_lev(int mem_lev) {
		this.mem_lev = mem_lev;
	}
	public String getMem_userid() {
		return mem_userid;
	}
	public void setMem_userid(String mem_userid) {
		this.mem_userid = mem_userid;
	}
	public String getMem_password() {
		return mem_password;
	}
	public void setMem_password(String mem_password) {
		this.mem_password = mem_password;
	}
	public String getMem_username() {
		return mem_username;
	}
	public void setMem_username(String mem_username) {
		this.mem_username = mem_username;
	}
	public String getMem_nickname() {
		return mem_nickname;
	}
	public void setMem_nickname(String mem_nickname) {
		this.mem_nickname = mem_nickname;
	}
	public String getMem_birth() {
		return mem_birth;
	}
	public void setMem_birth(String mem_birth) {
		this.mem_birth = mem_birth;
	}
	public String getMem_email() {
		return mem_email;
	}
	public void setMem_email(String mem_email) {
		this.mem_email = mem_email;
	}
	public String getMem_phone() {
		return mem_phone;
	}
	public void setMem_phone(String mem_phone) {
		this.mem_phone = mem_phone;
	}
	public String getMem_zipcode() {
		return mem_zipcode;
	}
	public void setMem_zipcode(String mem_zipcode) {
		this.mem_zipcode = mem_zipcode;
	}
	public String getMem_address1() {
		return mem_address1;
	}
	public void setMem_address1(String mem_address1) {
		this.mem_address1 = mem_address1;
	}
	public String getMem_address2() {
		return mem_address2;
	}
	public void setMem_address2(String mem_address2) {
		this.mem_address2 = mem_address2;
	}
	public String getMem_profile() {
		return mem_profile;
	}
	public void setMem_profile(String mem_profile) {
		this.mem_profile = mem_profile;
	}
	public String getMem_photo() {
		return mem_photo;
	}
	public void setMem_photo(String mem_photo) {
		this.mem_photo = mem_photo;
	}
	public Date getMem_reg() {
		return mem_reg;
	}
	public void setMem_reg(Date mem_reg) {
		this.mem_reg = mem_reg;
	}
	@Override
	public String toString() {
		return "MemberVO [mem_code=" + mem_code + ", mem_email_rec=" + mem_email_rec + ", mem_phone_rec="
				+ mem_phone_rec + ", mem_gender=" + mem_gender + ", mem_point=" + mem_point + ", mem_lev=" + mem_lev
				+ ", mem_userid=" + mem_userid + ", mem_password=" + mem_password + ", mem_username=" + mem_username
				+ ", mem_nickname=" + mem_nickname + ", mem_birth=" + mem_birth + ", mem_email=" + mem_email
				+ ", mem_phone=" + mem_phone + ", mem_zipcode=" + mem_zipcode + ", mem_address1=" + mem_address1
				+ ", mem_address2=" + mem_address2 + ", mem_profile=" + mem_profile + ", mem_photo=" + mem_photo
				+ ", mem_reg=" + mem_reg + "]";
	}	
}
