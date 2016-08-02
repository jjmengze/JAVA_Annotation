Welcome to learn annotations!
===================
----------


基本概述
-------------

Annotation是Java5開始引入的新特徵。

>  **Note:** An annotation is a form of metadata, that can be added toJava source code. Classes, methods, variables, parameters and packages may be annotated. Annotations have no direct effect on the operation of the code they annotate.

註解是一種描述資料的資料， 可以加入到java 程式碼中的 類別、方法、變數、參數、都可以被註解，註解對註解的程式碼沒有直接影響。

作用
 1. 作記號，用於告訴編譯器一些信息讓編譯器可以做前處理。
 2.  作記號，編譯時動態處理動態生成程式碼 。
 3. 作記號，運行時動態處理如得到註解信息

----------
Annotation 分類
----------------------

標準註解 

 - ＠Override             
 - @Deprecated
 - @SuppressWarnings

分別表示覆寫父類別方法，已過時的方法（不建議使用），忽略某項警告

 元註解
 
 - @Retention
 - @Target
 - @Inherited
 - @Documented
 元註解 是指用來定義 註解的註解，定義註解的作用範圍。在後面自定義註解的部分會詳細介紹。

自定義註解

**自定義註解 表示自己根據需要定義的 Annotation。在後面自定義註解的部分會詳細介紹。**


