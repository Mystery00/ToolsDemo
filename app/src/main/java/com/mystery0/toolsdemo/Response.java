/*
 * Created by Mystery0 on 17-12-26 下午11:29.
 * Copyright (c) 2017. All Rights reserved.
 *
 * Last modified 17-10-12 下午12:39
 */

package com.mystery0.toolsdemo;

public class Response
{
    int status;
    String mes;

    public Response(int status, String mes)
    {
        this.status = status;
        this.mes = mes;
    }

    public int getStatus()
    {
        return status;
    }

    public void setStatus(int status)
    {
        this.status = status;
    }

    public String getMes()
    {
        return mes;
    }

    public void setMes(String mes)
    {
        this.mes = mes;
    }

    @Override
    public String toString()
    {
        return "Response{" +
                "status=" + status +
                ", mes='" + mes + '\'' +
                '}';
    }
}
