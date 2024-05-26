<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
 <link href="CSS/adminstyle.css" rel="stylesheet">
     <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
 
 <script>
    function msg()
    {
      	swal("Good job!", "Added Successfully...!", "success"); 
     
    }
    
   </script>
    <script src="https://kit.fontawesome.com/cb39b22979.js" crossorigin="anonymous"></script>
   
</head>
<body>
<script type="module" src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.esm.js"></script>
<script nomodule src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.js"></script>
     <div class="container-fluid colorback">
    <div class="row flex-nowrap ">
        <div class="col-auto col-md-3 col-xl-2 px-sm-2 px-0 bg-dark ">
            <div class="d-flex sticky-top flex-column align-items-center align-items-sm-start px-3 pt-2 text-white min-vh-100">
                <a href="#men" class="d-flex align-items-center pb-3 mb-md-0 me-md-auto text-white text-decoration-none">
                    <span class="fs-5 d-none d-sm-inline text-warning mt-5"><img src="CSS/hindustan.png" style="height:40px;width:40px; border-radius:50%;" alt="PetrolPump">Petrol Pump</span>
                </a>
                <ul class="nav nav-pills flex-column mb-sm-auto mb-0 align-items-center align-items-sm-start  " id="menu">
                   
                   <li>
                        <a href="#submenu0" data-bs-toggle="collapse" class="nav-link px-0 align-middle  text-light">
                            <i class="fs-4 bi-speedometer2"></i><i class="fa-solid fa-arrow-up-from-water-pump"></i> <span class="ms-1 d-none d-sm-inline ">Dashboard</span> </a>
                        <ul class="collapse  nav flex-column ms-1" id="submenu0" data-bs-parent="#menu">
                            <li class="w-100">
                                <a href="adminndashboard.jsp" class="nav-link px-0"> <ion-icon name="add-circle-outline" class="text-danger" ></ion-icon> <span class="d-none d-sm-inline text-danger">Dash-Board</span>  </a>
                            </li>
                        </ul>
                    </li>
                   
                    <li>
                        <a href="#submenu1" data-bs-toggle="collapse" class="nav-link px-0 align-middle  text-light">
                            <i class="fs-4 bi-speedometer2"></i><i class="fa-solid fa-arrow-up-from-water-pump"></i> <span class="ms-1 d-none d-sm-inline ">Machines..</span> </a>
                        <ul class="collapse  nav flex-column ms-1" id="submenu1" data-bs-parent="#menu">
                            <li class="w-100">
                                <a href="addmachine.jsp" class="nav-link px-0"> <ion-icon name="add-circle-outline" class="text-danger" ></ion-icon> <span class="d-none d-sm-inline text-danger">Add Machines</span>  </a>
                            </li>
                            <li>
                                <a href="viewmachinr.jsp" class="nav-link px-0"><ion-icon name="eye-outline" class="text-danger"></ion-icon> <span class="d-none d-sm-inline text-danger">View Machines</span>  </a>
                            </li>
                        </ul>
                    </li>
                    <li>
                        <a href="#submenu2" data-bs-toggle="collapse" class="nav-link px-0 align-middle text-light">
                            <i class="fs-4 bi-speedometer2"></i><i class="fa-solid fa-gas-pump"></i> <span class="ms-1 d-none d-sm-inline">Fuel Type</span> </a>
                        <ul class="collapse  nav flex-column ms-1" id="submenu2" data-bs-parent="#menu">
                            <li class="w-100">
                                <a href="fueltype.jsp" class="nav-link px-0"><ion-icon name="add-circle-outline" class="text-success" ></ion-icon> <span class="d-none d-sm-inline text-success">Add New Type</span>  </a>
                            </li>
                            <li>
                                <a href="viewfueltype.jsp" class="nav-link px-0"><ion-icon name="eye-outline" class="text-success"></ion-icon> <span class="d-none d-sm-inline text-success">View Type</span>  </a>
                            </li>
                            
                        </ul>
                    </li>
               
                    <li>
                       <a href="#submenu3" data-bs-toggle="collapse" class="nav-link px-0 align-middle text-light">
                            <i class="fs-4 bi-bootstrap"></i><i class="fa-regular fa-user"></i> <span class="ms-1 d-none d-sm-inline">Employee Master</span></a>
                        <ul class="collapse nav flex-column ms-1" id="submenu3" data-bs-parent="#menu">
                            <li class="w-100">
                                <a href="addnewemployee.jsp" class="nav-link px-0"><ion-icon name="add-circle-outline" class="text-warning" ></ion-icon> <span class="d-none d-sm-inline text-warning">Add New Employee</span> </a>
                            </li>
                            <li>
                                <a href="viewallemployee.jsp" class="nav-link px-0"><ion-icon name="eye-outline" class="text-warning"></ion-icon> <span class="d-none d-sm-inline text-warning">View Employee</span> </a>
                            </li>
                        </ul>
                        </li>
                        
                        <li>
                        <a href="#submenu4" data-bs-toggle="collapse" class="nav-link px-0 align-middle text-light">
                            <i class="fs-4 bi-speedometer2"></i><i class="fa-solid fa-flag-checkered"></i><span class="ms-1 d-none d-sm-inline">Selling Report..</span> </a>
                        <ul class="collapse  nav flex-column ms-1" id="submenu4" data-bs-parent="#menu">
                            <li class="w-100">
                                <a href="sellReportAdminPage.jsp" class="nav-link px-0">  <span class="d-none d-sm-inline text-Warning">All Selling</span></a>
                            </li>
                            <li>
                                <a href="sellSearchByLetterUsingAJAX.jsp" class="nav-link px-0"><span class="d-none d-sm-inline text-Warning">Search Selling</span>  </a>
                            </li>
                            
                        </ul>
                    </li>
               
                <div class="dropdown pb-2 mt-3" >
                    <a href="#"  name="men" class="d-flex align-items-center text-white text-decoration-none dropdown-toggle" id="dropdownUser1" data-bs-toggle="dropdown" aria-expanded="false">
                       <img alt="..." href="https://www.linkedin.com/in/swapnil-gujar-a3aa90250/" src="CSS/SwapnilSmallIMG.jpeg" style="width:40px; height:40px; border-radius: 50%;"> 
                       <span class="d-none d-sm-inline mx-1">Swapnil</span>
                    </a>
                    <ul class="dropdown-menu dropdown-menu-dark text-small shadow " >
                        <li><a class="dropdown-item" href="first_page.jsp">Others Login</a></li>
                        <li><a class="dropdown-item" href="#">Settings</a></li>
                        <li><a class="dropdown-item" href="https://www.linkedin.com/in/swapnil-gujar-a3aa90250/">Linkedin Profile</a></li>
                        <li>
                            <hr class="dropdown-divider">
                        </li>
                        <li><a class="dropdown-item" href="#">Sign out</a></li>
                    </ul>
                </div>
            </div>
        </div>
        
</body>
</html>