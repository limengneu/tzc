/*
    ʾ��(����ͼƬ)��
    //����id,��,��
    var sc=new ScrollImg("abc",500,160);    
    //���ͼƬ��ͼƬ�����⣬��ַ
    sc.add("E:\\��վ\\��������\\IMG\\banner\\1.jpg","1","http://www.baidu.com/");
    sc.add("E:\\��վ\\��������\\IMG\\banner\\2.jpg","2","");
    sc.add("E:\\��վ\\��������\\IMG\\banner\\3.jpg","3","");
    //��ʾ
    sc.show();
*/

//����ͼƬ������
function ScrollImg(id,width,height){
    //������Ϣ
    this.width=width;       //��
    this.height=height;     //��
    this._h=height-6;       //ͼƬ��
    this._w=(this._h)/3*4;  //ͼƬ��
    
    //��Ա
    this.useMask=false; //�Ƿ�ʹ��ˮӡ
    this.timer=null;
    this.step=1;
    this.img=new Array();//ͼƬ
    this.tip=new Array();//˵��
    this.url=new Array();//��ַ        
	this.price=new Array();//�۸�
    this.id=id;          //����ID
    this.mHtml="";       //���ɵĴ���        
    ///��Ӷ���
    this.add=function(img,tip,url,m_price){
        var i=this.img.length;
        this.img[i]=img;
        this.tip[i]=tip;
        this.url[i]=url;
		this.price[i]=m_price;
    }
    ///��������
    this.show=function(){            
        this.mHtml+=("<div id='"+this.id+"' style='position:relative;width:"+this.width+"px;height:"+(this.height+24)+"px;border:1px solid #eeeeee;overflow:hidden;padding:0px;'>");
        this.mHtml+=("<div id='"+this.id+"content' style='position:absolute;left:0px;top:0px;width:"+(2*(this._w+3)*this.img.length)+"px;height:"+(this.height+24)+"px;border:0px;overflow:hidden;'>");
        for(var j=0;j<2;j++){
            for(var i=0;i<this.img.length;i++){
                var uri="";
                if(this.url[i].length>0) 
                    uri=" href='"+this.url[i]+"' ";
                else
                    uri=" style='cursor:hand;' "
				
				var title=this.tip[i];
				var price=this.price[i];
				if(price=='0') 
					price="���޼۸�";
				else
					price="�ο���(RMB):"+price+"Ԫ";
				if(title.length>=11) title=title.substring(0,10)+"..";
				this.mHtml+=("<a "+uri+" title='"+this.tip[i]+"' target='_blank' style='display:inline-block;width:"+this._w+"px;height:"+(this._h+24)+"px;position:relative;overflow:Hidden;text-align:center;'><img src='"+this.img[i]+"' alt='' style='border:1px solid #eeeeee;margin-left:1px;margin-top:1px;border:0px;width:100%;height:"+(this._h-20)+"px;'  alt='"+this.tip[i]+"' /><br />"+title
								+" <br /><span style='color:red;'>["+price+"]</span>");
                if(this.useMask) this.mHtml+=("");
                this.mHtml+="</a>";
            }
        }
        this.mHtml+=("</div>");
        this.mHtml+=("</div>");
        document.write(this.mHtml);
        
        var self=this;
        this.timer=setInterval(function(){self.play();},1);
        
        document.getElementById(this.id+"content").onmouseover=function(){self.step=0;}
        document.getElementById(this.id+"content").onmouseout=function(){self.step=1;}
    }
    //��ʼ����
    this.play=function(){            
        var l=0;
        l= parseInt(document.getElementById(this.id+"content").style.left);
        l=l-this.step;            
        if( l<=(-(this.img.length*(this._w+3))) ) l=0;
        document.getElementById(this.id+"content").style.left=""+l+"px";
    }
    
}



