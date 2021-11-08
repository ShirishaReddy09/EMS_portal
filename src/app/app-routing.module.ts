import { EmployeeDetailsComponent } from './employee-details/employee-details.component';
import { CreateEmployeeComponent } from './create-employee/create-employee.component';
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { EmployeeListComponent } from './employee-list/employee-list.component';
import { UpdateEmployeeComponent } from './update-employee/update-employee.component';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { ContactComponent } from './contact/contact.component';
import { EmsComponent } from './ems/ems.component';



const routes: Routes = [
 // { path: '', redirectTo: 'employee', pathMatch: 'full' },
 {path:'',component:HomeComponent},
 {path:'home',component:HomeComponent},

 {path:'login',component:LoginComponent},
 //{path:'contact/login',component:LoginComponent},
 //{path:'home/login',component:LoginComponent},
 
 {path:'contact',component:ContactComponent},

 {path:'login/ems',component:EmployeeListComponent},

{path:'login/ems/employees',component:EmployeeListComponent},
{path:'login/ems/add',component:CreateEmployeeComponent},
{path:'employees/add',component:CreateEmployeeComponent},



  { path: 'employees', component: EmployeeListComponent },
  { path: 'add', component: CreateEmployeeComponent },
  { path: 'update/:id', component: UpdateEmployeeComponent },
  { path: 'details/:id', component: EmployeeDetailsComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
