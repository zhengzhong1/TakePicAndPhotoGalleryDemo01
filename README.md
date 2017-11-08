# TakePicAndPhotoGalleryDemo01
好久之前写过一篇关于解决Android7.0拍照、访问相册问题的一篇博客http://blog.csdn.net/zz110753/article/details/60877594
也分享了这篇博客的demo到自己的GitHub上，由于我是在activity中直接去进行讲解，很多老哥留言说自己需要在fragment中使用,那为了可以更好的服务大家，抽个时间分享一下Fragment中去拍照访问现存的Demo，希望对大家有所帮助。


Android拍照、相册访问图片剪裁适配到Android7.0(Fragemnt中使用)
Android7.0中尝试传递 file:// URI 会触发 FileUriExposedException，因为在Android7.0之后Google认为直接使用本地的根目录即file:// URI是不安全的操作，直接访问会抛出FileUriExposedExCeption异常，这就意味着在Android7.0以前我们访问相机拍照存储时，如果使用URI的方式直接存储剪裁图片就会造成这个异常.
* 调用系统相机拍照

![image](https://github.com/zhengzhong1/Android6.0PermissionsDemo/blob/master/app/src/main/assets/GIF.gif)

* 打开系统相册

![image](https://github.com/zhengzhong1/Android6.0PermissionsDemo/blob/master/app/src/main/assets/GIF2.gif)
