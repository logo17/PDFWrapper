package com.example.pdftest1

import android.app.Application
import com.tom_roush.pdfbox.android.PDFBoxResourceLoader

class BaseApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        PDFBoxResourceLoader.init(this)
    }
}