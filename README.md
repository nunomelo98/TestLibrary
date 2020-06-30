# TestLibrary
this is my first library to see the process to make a library and publish her on github. and jitpack.io its just a simple
this is a library to  make simple operation like plus, minus, time and divider.
To use this library wath you need to is to put the depenencies with jitpack or with jcenter.

# Instalation wit Jitpack
step 1
Add it in your root build.gradle at the end of repositories:


    allprojects {
		repositories {
		maven { url 'https://jitpack.io' }
		}
	}
  
 Step 2 add the dependencies:
 
    dependencies {
	       implementation 'com.github.nunomelo98:TestLibrary:1.0'
	}
	
# Instalation witth jcenter	

  go to your buil.gradle module app in the dependencies:

    dependencies {
	        implementation 'com.github.nunomelo98:TestLibrary:1.1'
	}
	
   [![](https://jitpack.io/v/nunomelo98/TestLibrary.svg)](https://jitpack.io/#nunomelo98/TestLibrary)
