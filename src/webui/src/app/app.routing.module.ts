
import {NgModule} from "@angular/core";
import {RouterModule, Routes} from "@angular/router";
import {ProjectComponent} from "./pages/project/project.component";
import {DashboardComponent} from "./pages/dashboard/dashboard.component";
import {TaskComponent} from "./pages/task/task.component";

const routes: Routes = [

      {path:'', pathMatch: 'full',redirectTo:'/dashboard'},
      {path:'task',component: TaskComponent},
      {path:'dashboard',component: DashboardComponent},
      {path:'project', component: ProjectComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
