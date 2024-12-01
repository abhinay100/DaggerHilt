package com.example.daggerhilt

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton


/**
 * Created by Abhinay on 01/12/24.
 *
 *
 */
@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    @Named("String1")
    fun provideTestString1() = "This is a string we will inject"

   /* @Singleton
    @Provides
    @Named("String2")
    fun provideTestString2() = "This is a string we will inject as well"*/
}