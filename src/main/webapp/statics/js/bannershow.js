/***************************************
    Copyright ? 2009 Lexy
    QQ:630-673-630
    说明：BannerShow类用于构造一个图片切换效果的Banner(淡入淡出)
    调用方法：
        1:创建对象      var banner=new BannerShow();
        2:添加图片      banner.AddImage(图片地址,图片标题,图片链接);
        3:创建HTML元素  banner.create(对象ID,宽,高);
        4:开始播放      banner.play();
        5:停止播放      banner.stop();
    示例：
    <script type="text/javascript" src="bannershow.js"></script>
    <script type="text/javascript">
        var banner=new BannerShow();    
        banner.AddImage("d:\\我的文档\\我的图片\\win7\\img1.jpg","标题","http://www.baidu.com/");
        banner.AddImage("d:\\我的文档\\我的图片\\win7\\img2.jpg","标题","http://www.baidu.com/");
        banner.AddImage("d:\\我的文档\\我的图片\\win7\\img3.jpg","标题","http://www.baidu.com/");
        banner.AddImage("d:\\我的文档\\我的图片\\win7\\img4.jpg","标题","http://www.baidu.com/");
        banner.create("abc","320","240");
        banner.play();
    </script>
****************************************/
function BannerShow(){
    this.mID=null;
    this.timer=null;
    this.mHtml="";
    this.Img=new Array();        
    this.Title=new Array();
    this.Address=new Array();
    this.index=-1;
    //添加图片
    this.addimage=function(img,title,address){
        this.Img[this.Img.length]=img;
        this.Title[this.Title.length]=title;
        this.Address[this.Address.length]=address;
    }
    //开始播放
    this.playNext=function(){
        this.index++;
        if(this.index >= this.Img.length) this.index=0;
        for(var i=0;i<this.Img.length;i++){                
            if(i==this.index){
            	document.getElementById(this.mID+"img"+i).filters.blendTrans.apply(); 
                document.getElementById(this.mID+"img"+i).style.visibility = "visible"; 
                document.getElementById(this.mID+"img"+i).filters.blendTrans.play(); 
            }else{
                document.getElementById(this.mID+"img"+i).filters.blendTrans.apply(); 
                document.getElementById(this.mID+"img"+i).style.visibility = "hidden"; 
                document.getElementById(this.mID+"img"+i).filters.blendTrans.play(); 
            }
        }            
    }
    //开始构建
    this.create=function(id,width,height){
        this.mID=id;
        this.mHtml="<div id='"+id+"' style='width:"+width+"px;height:"+height+"px;position:relative;overflow:hidden;'>";
        for(var i=0;i<this.Img.length;i++){
            this.mHtml=this.mHtml+"<a href='"+this.Address[i]+"' title='"+this.Title[i]+"' target='_blank'><img alt='"+this.Title[i]+"' id='"+id+"img"+i+"' src='"+this.Img[i]+"' style='width:100%;height:100%;position:absolute;top:0px;left:0px;margin:0px;FILTER: blendTrans(duration=1);border:0px;"
            if(i!=0) this.mHtml=this.mHtml+"visibility:hidden;";//将第一个设为可见
            this.mHtml=this.mHtml+"' /></a>";
        }
        this.mHtml=this.mHtml+"</div>";
        document.write(this.mHtml);
    }
    //播放
    this.play=function(){
        if(this.timer==null){
            var self=this;
            this.timer=setInterval(function(){self.playNext();},5000);
        }
    }
    //停止
    this.stop=function(){
        clearInterval(this.timer);
        this.timer=null;
    }
    //调用构建
    
    
}
