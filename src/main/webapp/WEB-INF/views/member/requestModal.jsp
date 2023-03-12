<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="" />
<!-- histoty Modal-->
<div class="modal-header">
    <h5 class="modal-title" id="historyModalLabel">ID - Modal</h5>
    <button class="close" type="button" data-dismiss="modal" aria-label="Close">
        <span aria-hidden="true">×</span>
    </button>
</div>
<div class="modal-body">
    <div class="table-responsive">
        <div class="container">
        </div>
        <div class="row">
						<h1 class="font-weight-bold">예약신청</h1>
					</div>
					<hr>
					<!-- Form Row -->
					<form class="user" action="request" method=POST>
						<div class="col-xl-12 mb-4">
							<!-- 수거 날짜 선택 -->
							<div class="card shadow mb-4">
								<div class="card-header py-3">
									<h4 class="m-0 font-weight-bold text-primary">수거일을 선택하세요</h4>
								</div>
								<div class="card-body">
									<input type="date" id="collectDate" name="collectDate" value="2023-01-01" min="2018-01-01" max="2023-12-31">
								</div>
							</div>
							<!-- End 수거 날짜 선택 -->
							<!-- 요청사항 입력 -->
							<div class="card shadow mb-4">
								<div class="card-header py-3">
									<h4 class="m-0 font-weight-bold text-primary">요청사항을 입력해 주세요</h4>
								</div>
								<div class="card-body">
									<div class="input-group">
										<input type="text" id="laundryRequest" name="laundryRequest" class="form-control bg-light border-0 large" placeholder="요청사항을 입력하세요" aria-label="Search" aria-describedby="basic-addon2">
									</div>
								</div>
							</div>
							<input type='submit'>
							<!-- End of 요청사항 입력 -->
							<div class="my-2"></div>
							<a href="#" class="btn btn-primary btn-icon-split btn-lg">
								<span class="icon text-white-50"> <i class="fas fa-check"></i>
								</span> <span class="text">예약 신청하기</span>
							</a>
						</div>
					</form>
					<!-- End of Form -->
    </div>

</div>
<div class="modal-footer">
    <button class="btn btn-secondary" type="button" data-dismiss="modal">Cancel</button>