<%@page import="com.minhanh.Model.Tour"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.minhanh.Model.Tour_DAO"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>

<html lang="vi">
  <head>
    <base href="./">
    <meta charset="utf-8">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
    <meta name="description" content="CoreUI - Open Source Bootstrap Admin Template">
    <meta name="author" content="Łukasz Holeczek">
    <meta name="keyword" content="Bootstrap,Admin,Template,Open,Source,jQuery,CSS,HTML,RWD,Dashboard">
    <title>Thêm Hóa Đơn</title>
 
    <!-- Main styles for this application-->
    <link href="admin/css/style.css" rel="stylesheet">
    <script type="text/javascript" src="admin/js/jquery-3.3.1.min.js"></script>
    <link href="admin/vendors/pace-progress/css/pace.min.css" rel="stylesheet">
    <!-- Global site tag (gtag.js) - Google Analytics-->
    <link rel="stylesheet" type="text/css" href="admin/css/font-awesome.min.css">
    <link rel="stylesheet" type="text/css" href="admin/css/style2.css">
    
  

   
    <script type="text/javascript" src="admin/js/bootstrap.min.js"></script>
    
    <script type="text/javascript" src="admin/js/custom.js"></script>
    <script type="text/javascript" src="admin/js/nicEdit.js"></script>
   <script type="text/javascript" src="admin/ckeditor/ckeditor.js"></script>
    <script type="text/javascript">		
    </script>  

  </head>
  
  <body class="app header-fixed sidebar-fixed aside-menu-fixed sidebar-lg-show">
  <% 
//   		Tour_DAO Tour_DAO = new Tour_DAO();
//   		ArrayList<Tour> listTours =Tour_DAO.getListTour();
		Tour_DAO Tour_DAO = new Tour_DAO();
		ArrayList<Tour> listTours =Tour_DAO.getListTour();
  %>
  <%
//   String error="";
//   	if(request.getParameter("error")!=null){
//   		error=(String) request.getParameter("error");
//   	}
	String error="";
	if(request.getParameter("error")!=null){
		error=(String) request.getParameter("error");
	}
  %>
  
    <header class="app-header navbar">
      <button class="navbar-toggler sidebar-toggler d-lg-none mr-auto" type="button" data-toggle="sidebar-show">
        <span class="navbar-toggler-icon"></span>
      </button>
      <a class="navbar-brand" href="/home/Admin_View_Controller">
        <img class="navbar-brand-full" src="admin/img/brand/logo1.png" width="89" height="25" alt="VQDN">
        <img class="navbar-brand-minimized" src="admin/img/brand/logo1.png" width="30" height="30" alt="VQVN">
      </a>
      <button class="navbar-toggler sidebar-toggler d-md-down-none" type="button" data-toggle="sidebar-lg-show">
        <span class="navbar-toggler-icon"></span>
      </button>
      <ul class="nav navbar-nav ml-auto">
        <li class="nav-item d-md-down-none">
          <a class="nav-link" href="#">
            <i class="icon-list"></i>
          </a>
        </li>
        <li class="nav-item d-md-down-none">
          <a class="nav-link" href="#">
            <i class="icon-location-pin"></i>
          </a>
        </li>
        <li class="nav-item dropdown dropleft float-right">
          <a class="nav-link" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false">
              <img class="img-avatar" src="admin/img/avatars/8.png" alt="admin.com">
            
            </div>
          </a>
          
        </li>
      </ul>
      <button class="navbar-toggler aside-menu-toggler d-md-down-none" type="button" data-toggle="aside-menu-lg-show">
        <span class="navbar-toggler-icon"></span>
      </button>
      <button class="navbar-toggler aside-menu-toggler d-lg-none" type="button" data-toggle="aside-menu-show">
        <span class="navbar-toggler-icon"></span>
      </button>
    </header>
    <div class="app-body">
      <div class="sidebar">
        <nav class="sidebar-nav">
          <ul class="nav">
            <li class="nav-item">
              <a class="nav-link" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false">
                <div class="row">
                  <div class="col-lg-4">
                    <img class="img-avatar" src="admin/img/avatars/8.png" alt="admin.com">
                  </div>
                  <div class="col-lg-8">
                    <span>Ẩn Danh</span> <br/>
                    <span class="fa fa-circle" style="color: #12ce12; font-size: 10px"></span> <span>online</span>
                  </div>
                </div>
              </a>
            </li>
            <input style="position: relative;" class="nav-title" placeholder="Tìm kiếm" type="text" name="">
            <button style="position: absolute; top: 82px; color: black; left: 150px;background-color: white;border: none;" class="fa fa-search"></button>
           
            <li class="nav-title">
               <a class="nav-link manager-category" data-set=".main-employee-manager" href="/home/Admin_View_Controller_Customer">
                <div>Quản Lý Tour</div>
              </a>
<!--             </li> -->
<!--             <li class="nav-title"> -->
<!--               <a class="nav-link manager-category" data-set=".main-category-manager" href="productmanagement.html"> -->
<!--                 <div>Quản lý danh mục</div> -->
<!--               </a> -->
<!--             </li> -->
            <li class="nav-title">
                <a style="background-color: green"  class="nav-link manager-category" data-set=".main-employee-manager" href="/home/Update_Customer_Controller">
                <div>Thêm Hóa Đơn hóa đơn</div>
              </a>
            </li>
            <li class="nav-title">
              <a class="nav-link manager-category" data-set=".main-employee-manager" href="/home/Qlnv_View_Controller">
                <div>Quản lý nhân viên</div>
              </a>
            </li>
            
          </ul>
        </nav>
        <button class="sidebar-minimizer brand-minimizer" type="button"></button>
      </div>
      
      <!-- Controller -->
      
      <form action="/home/Customer_Controller" method="post" accept-charset="utf-8">
      	
      	
       <main class="main">
      <div class="main-content main-product-manager">
            <h2 class="breadcrumb breadcrumb-item">Thêm Hoá Đơn</h2>
          <div class="row">
          
			
            
            <div class="col-lg-4">
              <h6>Tên Khách Hàng </h6><p style="color: red"></p>
              <td><input type="text" class="form-control" name="themten" /><%=error%></td>
            </div>
            
             <div class="col-lg-4">
              <h6>Tour Chọn</h6><p style="color: red"></p>
             <input type="text" class="form-control" name="tourchon" />
            </div>
            
            <div class="col-lg-4">
              <h6>SĐT</h6><p style="color: red"></p>
              <input type="text" class="form-control" name="sdt" />
            </div>
            
            <div class="col-lg-4">
              <h6>Điạ Chỉ</h6><p style="color: red"></p>
              <input type="text" class="form-control" name="diachi" />         
            </div>
  			
  			<div class="col-lg-4">
              <h6>Số Chưng Minh Thư</h6><p style="color: red"></p>
              <input type="text" class="form-control" name="cmtnd" />         
            </div>
            
            
            <div class="col-lg-4">
              <h6>Email</h6><p style="color: red"></p>
              <input type="text" class="form-control" name="email" />         
            </div>
            
            <div class="col-lg-4">
              <h6>Thời Gian Lập</h6><p style="color: red"></p>
              <input class="form-control" type="datetime-local"  name="thoigianlap" />                           
            </div>
         
               <div class="col-lg-4">
              <h6>Tổng Số Người</h6><p style="color: red"></p>
              <input type="text" class="form-control" name="tongsonguoi" />          
            </div>
              <div class="col-lg-4">
                <h6>Hình ảnh</h6>
                
                  <input type="file" class="form-control" name="uploadFile" id="uploadFile">
                         
              </div>
              
            
            <div class="col-lg-4">
              <h6>Hình Thức Thanh Toán</h6><p style="color: red"></p>
              <input type="text" class="form-control" name="hinhthucthanhtoan" />
            </div>          				
           
          </div>
          
          <div class="row">

             

              <div class="col-lg-8">
                <td><h6>Mô tả</h6></td>
                <td>
                
               <textarea class="form-textarea" id="noiDung" name="mota" ></textarea>
                <script type="text/javascript" language="javascript" >
							CKEDITOR.replace('noiDung',{width: '700px',height : '300px'});
   						
				</script>
                </td>
              </div>
              
            </div>
            
          <div class="row btn-add-product">
            <div class="col-lg-12">
           
    
             <input type="hidden" name="command" value="update">
             <input type="hidden" name="customer_id" value="<%=request.getAttribute("customer_id")%>">
              <button class="btn btn-success">Cập Nhật Hóa Đơn</button>
            </div>
          </div>
          
        </div>
        
        
      </main>
     </form>
 
 

      <aside class="aside-menu">
        <ul class="nav nav-tabs" role="tablist">
          <li class="nav-item">
            <a class="nav-link active" data-toggle="tab" href="#timeline" role="tab">
              <i class="icon-list"></i>
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" data-toggle="tab" href="#messages" role="tab">
              <i class="icon-speech"></i>
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" data-toggle="tab" href="#settings" role="tab">
              <i class="icon-settings"></i>
            </a>
          </li>
      
               
            <div class="progress progress-xs">
              <div class="progress-bar bg-danger" role="progressbar" style="width: 95%" aria-valuenow="95" aria-valuemin="0" aria-valuemax="100"></div>
            </div>
           
            <div class="text-uppercase mb-1 mt-2">
              <small>
                
              </small>
            </div>
            <div class="progress progress-xs">
              <div class="progress-bar bg-success" role="progressbar" style="width: 10%" aria-valuenow="10" aria-valuemin="0" aria-valuemax="100"></div>
            </div>
            
          </div>
        </div>
      </aside>
    </div>
    <footer class="app-footer">
      
      <div class="ml-auto">
        <span>Designed by</span>
        <a href="https://facebook.com/ngominhanh.97">Minhanh</a>
      </div>
    </footer>
 
  </body>
  <script>
  var files=[];
	$("#uploadFile").change(function() {

		files = event.target.files;
		forms = new FormData();
		forms.append("file",files[0]);
		
		$.ajax({
			url:"./TraVe_API_Controller",
			type:"POST",
			data:forms,
			contentType:false,
			processData:false,
			enctype:"multipart/form-data",
			success: function(data) {					
			}
		}).done(function(rs){
			
		})
	});
  
  </script>
  	
  	
  	
</html>