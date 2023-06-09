import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { HomeComponent } from './main/home/home.component';
import { CreatePgComponent } from './main/create-pg/create-pg.component';
import { ArchivioComponent } from './main/archivio/archivio.component';
import { CardPgComponent } from './main/cards/card-pg/card-pg.component';
import { LoginComponent } from './log/login/login.component';
import { SignUpComponent } from './log/sign-up/sign-up.component';
import { CardUserComponent } from './main/cards/card-user/card-user.component';
import { HomeLogComponent } from './logUser/home-log/home-log.component';
import { ReactiveFormsModule } from '@angular/forms';
import {HttpClientModule} from '@angular/common/http';
import { HttpClient } from '@angular/common/http';
import { AboutComponent } from './main/about/about.component';
import { SpinnerComponent } from './animation/spinner/spinner.component';
import { CompareComponent } from './main/compare/compare.component';
import { DetailsPgComponent } from './main/details-pg/details-pg.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { AlertComponent } from './dialog/alert/alert.component';
import { CampagnaComponent } from './main/campagna/campagna.component';
import { CreaComponent } from './main/campagna/crea/crea.component';
import { CardCampagnaComponent } from './main/cards/card-campagna/card-campagna.component';
import { DetailComponent } from './main/campagna/detail/detail.component';
@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    HomeComponent,
    CreatePgComponent,
    ArchivioComponent,
    CardPgComponent,
    LoginComponent,
    SignUpComponent,
    CardUserComponent,
    HomeLogComponent,
    AboutComponent,
    SpinnerComponent,
    CompareComponent,
    DetailsPgComponent,
    AlertComponent,
    CampagnaComponent,
    CreaComponent,
    CardCampagnaComponent,
    DetailComponent,
  ],
  imports: [ 
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    HttpClientModule,
    BrowserAnimationsModule
  

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
