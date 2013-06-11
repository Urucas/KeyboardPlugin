KeyboardPlugin
==============

Phonegap Plugin for Android to trigger keyboard show via js

Installation
============

* Copy **com.urucas.plugins.Keyboard** into to your Android project **src/**

* Add the plugin markup to the **config.xml** file of the phonegap project 
``<plugin name="KeyboardPlugin" value="com.urucas.plugins.KeyboardPlugin"/> ``


Usage
=====

<code>
cordova.exec(null, null, "KeyboardPlugin", "show", []);
</code>


License
=======
* CDDL-1.0
* GPL-2.0
* BSD
