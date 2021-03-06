/*
 * Copyright (c) 2016 oleh Agustinus Ignat Deswanto
 *
 *  Dilarang menyalah gunakan aplikasi ini terutama untuk tindak kejahatan.
 *  Jika ada pertanyaan seputar aplikasi ini silakan menghubungi :
 *
 *  Agustinus Ignat Deswanto
 *  Permata Depok Nilam F5a No. 5
 *  Citayam - Depok 16430
 *  Jawa Barat - Indonesia
 *  HP/WA : 085770706777
 *  Email : aignatd@gmail.com
 *
 */

package com.fz.fzapp.service;

import com.fz.fzapp.pojo.LoginPojo;
import com.fz.fzapp.pojo.TaskListPojo;
import com.fz.fzapp.sending.TaskListHolder;
import com.fz.fzapp.sending.UserHolder;
import com.fz.fzapp.utils.FixValue;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Dibuat oleh : ignat
 * Tanggal : 26-Nov-16
 * HP/WA : 0857 7070 6 777
 */
public interface DataLink
{
  @POST(FixValue.RestfulLogin)
  Call<LoginPojo> LoginService(@Body UserHolder userHolder);

  @POST(FixValue.RestfulLogout)
  Call<LoginPojo> LogoutService(@Body UserHolder loginHolder);

  @POST(FixValue.RestfulChangePassword)
  Call<LoginPojo> ChangePasswordService(@Body UserHolder userHolder);

  @POST(FixValue.RestfulRegistration)
  Call<LoginPojo> RegistrationService(@Body UserHolder userHolder);

  @POST(FixValue.RestfulTasklist)
  Call<TaskListPojo> TaskListService(@Body TaskListHolder taskListHolder);
}

