import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './log/login/login.component';
import { SignUpComponent } from './log/sign-up/sign-up.component';
import { HomeLogComponent } from './logUser/home-log/home-log.component';
import { AboutComponent } from './main/about/about.component';
import { ArchivioComponent } from './main/archivio/archivio.component';
import { CardUserComponent } from './main/cards/card-user/card-user.component';
import { CompareComponent } from './main/compare/compare.component';
import { CreatePgComponent } from './main/create-pg/create-pg.component';
import { HomeComponent } from './main/home/home.component';

const routes: Routes = [
  { path: '', component: HomeComponent},
  { path: 'home', component:CardUserComponent },
  { path: 'crea', component: CreatePgComponent }, 
  { path: 'archivio', component: ArchivioComponent }, 
  { path: 'compare', component: CompareComponent }, 
  { path: 'aboutUs', component: AboutComponent }, 
  { path: 'login', component: LoginComponent },
  { path: 'signUp', component: SignUpComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
