//**************************************************************
//              【添加FLASH控件到网页中】
//                      版本：2.0
//090217:更改为支持静态网页
//**************************************************************
function addFlash(m_width,m_height,m_style,m_src,m_flashvars)
{
    document.write("<object classid='clsid:D27CDB6E-AE6D-11cf-96B8-444553540000' width="+m_width+" height="+m_height+" style=\"margin:0px;"+m_style+"\">");
    document.write("<param name='movie' value='"+m_src+"' />");
    document.write("<param name='quality' value='high' />");
    document.write("<param name='menu' value='false' />");
    document.write("<param name='wmode' value='transparent' /> ");
    document.write("<param name='flashvars' value='"+m_flashvars+"' /> ");    
    document.write("</object>");
}

//***********************************************************
//在线客服
function KF(qq,info){
    var _self=this;
    //飘动    
    this.move=function(){        
        var img=document.getElementById("kfdiv").style.top=80+document.documentElement.scrollTop;//80+document.body.scrollTop;
    }
    
    //输出对象
    var html="<a href='tencent://message?uin="+qq+"'><div id='kfdiv' style='cursor:hand;position:absolute;width:100px;height:200px;top:80px;right:3px; background:url(\"../img/kf.gif\") no-repeat;' >\r\n";
    html+=("<div style='cursor:hand;position:absolute;width:90px;height:70px;border:0px solid red;left:5px;top:115px;overflow:hidden;'>"+info+"</div>");    
    html+=("</div></a>\r\n");
    document.write(html);
    //设置事件
    window.onscroll=function(){_self.move();}
    window.onresize=function(){_self.move();}
    /*
    <a href="http://sighttp.qq.com/cgi-bin/check?sigkey=5a47860199865b77be058009a9deec4d06c3190ad09f5d922fda74a368a7e08dd1fa3319654ced62b3819486f2ce4d92e41e7b6be7e79e5af62fcde96403820a"; target=_blank; onclick="var tempSrc='http://sighttp.qq.com/wpa.js?rantime='+Math.random()+'&sigkey=5a47860199865b77be058009a9deec4d06c3190ad09f5d922fda74a368a7e08dd1fa3319654ced62b3819486f2ce4d92e41e7b6be7e79e5af62fcde96403820a';var oldscript=document.getElementById('testJs');var newscript=document.createElement('script');newscript.setAttribute('type','text/javascript'); newscript.setAttribute('id', 'testJs');newscript.setAttribute('src',tempSrc);if(oldscript == null){document.body.appendChild(newscript);}else{oldscript.parentNode.replaceChild(newscript, oldscript);}return false;"><img border="0" SRC='http://wpa.qq.com/pa?p=1:476071250:4' alt="点击这里给我发消息"></a>
    */
}

//收藏

function AddFav(){
	AddFavorite(window.location,document.title);
}
function AddFavorite(sURL, sTitle)
{
    try{window.external.addFavorite(sURL, sTitle);}
    catch (e){
        try{window.sidebar.addPanel(sTitle, sURL, "");}
        catch (e){alert("加入收藏失败，请使用Ctrl+D进行添加");}
    }
}
//设为首页
function setHome(This){
    This.style.behavior='url(#default#homepage)';
    This.setHomePage(window.location);
}






　 

