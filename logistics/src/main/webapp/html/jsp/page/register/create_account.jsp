<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<div class="container-fluid">
	<div class="row">
		<div class="col-xs-6">
			<div class="form-group">
				<label>Địa chỉ Email</label>
				<input type="email" id="crEmail" class="form-control" />
			</div>
		</div>
		<div class="col-xs-6">
			<div class="form-group">
				<label>Mật khẩu</label>
				<input type="password" id="crPassword" class="form-control" />
			</div>
		</div>
	</div>
	<div class="row">
		<div class="col-xs-6">
			<div class="form-group">
				<label>Mật khẩu</label>
				<input type="password" id="crPassword1" class="form-control" />
			</div>
		</div>
		<div class="col-xs-6">
			<div class="form-group">
				<label>Nhập lại mật khẩu</label>
				<input type="password" id="crPassword2" class="form-control" />
			</div>
		</div>
	</div>
	<div class="row">
		<div class="col-xs-6">
			<div class="form-group">
				<label>Họ</label>
				<input type="text" id="crLastName" class="form-control" />
			</div>
		</div>
		<div class="col-xs-6">
			<div class="form-group">
				<label>Tên</label>
				<input type="text" id="crFirstName" class="form-control" />
			</div>
		</div>
	</div>
	<div class="row">
		<div class="col-xs-6">
			<div class="form-group">
				<label>Địa chỉ</label>
				<input type="text" id="crAddress" class="form-control" />
			</div>
		</div>
		<div class="col-xs-6">
			<div class="form-group">
				<label>Ngày sinh</label>
				<input type="date" id="crBirthDay" class="form-control" />
			</div>
		</div>
	</div>
	<div class="row">
		<div class="col-xs-6">
			<div class="form-group">
				<label>Điện thoại</label>
				<input type="number" id="crPhone" class="form-control" />
			</div>
		</div>
		<div class="col-xs-6">
			<div class="form-group">
				<label>Fax</label>
				<input type="number" id="crFax" class="form-control" />
			</div>
		</div>
	</div>
	<div class="row">
		<div class="col-xs-12">
			<div class="form-group">
				<label>Website</label>
				<input type="url" id="crWebsite" class="form-control" />
			</div>
		</div>
	</div>
	<div class="row">
		<div class="col-xs-12" style="text-align: center">
			<button type="button" class="btn">Hủy</button>
			<button type="button" class="btn">Đăng kí</button>
		</div>
	</div>
</div>