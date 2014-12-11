
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object login extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Application.Login],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(form: Form[Application.Login]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.33*/("""

<html>
    <head>
        <title>login</title>
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*6.59*/routes/*6.65*/.Assets.at("images/favicon.png"))),format.raw/*6.97*/("""">
	    <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*7.67*/routes/*7.73*/.Assets.at("stylesheets/bootstrap.min.css"))),format.raw/*7.116*/("""">
    	<link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*8.67*/routes/*8.73*/.Assets.at("stylesheets/signin.css"))),format.raw/*8.109*/("""">
    	<script type='text/javascript' src=""""),_display_(Seq[Any](/*9.43*/routes/*9.49*/.Assets.at("javascripts/bootsrap.min.js"))),format.raw/*9.90*/(""""></script>
   
    	<script type='text/javascript' src=""""),_display_(Seq[Any](/*11.43*/routes/*11.49*/.Assets.at("javascripts/jquery-1.11.1.min.js"))),format.raw/*11.95*/(""""></script>
    </head>
    <body>
        <div class="container">
        
        """),_display_(Seq[Any](/*16.10*/helper/*16.16*/.form(routes.Application.authenticate)/*16.54*/ {_display_(Seq[Any](format.raw/*16.56*/("""
            <div class="hero-unit">
        	
            <h1>Sign in</h1>
			</div>            
            """),_display_(Seq[Any](/*21.14*/if(form.hasGlobalErrors)/*21.38*/ {_display_(Seq[Any](format.raw/*21.40*/(""" 
                <p class="error">
                    """),_display_(Seq[Any](/*23.22*/form/*23.26*/.globalError.message)),format.raw/*23.46*/("""
                </p>
            """)))})),format.raw/*25.14*/("""
            
            """),_display_(Seq[Any](/*27.14*/if(flash.contains("success"))/*27.43*/ {_display_(Seq[Any](format.raw/*27.45*/("""
                <p class="success">
                    """),_display_(Seq[Any](/*29.22*/flash/*29.27*/.get("success"))),format.raw/*29.42*/("""
                </p>
            """)))})),format.raw/*31.14*/("""
             <form class="form-signin">
            <p>
             	<input type="email" class="form-control" id="inputEmail"  name="email" placeholder="Email" value=""""),_display_(Seq[Any](/*34.114*/form("email")/*34.127*/.value)),format.raw/*34.133*/("""">
            </p>
            <p>
                <input type="password" class="form-control" name="password" placeholder="Password">
            </p>
            <p>
                
                <button class="btn btn-primary btn-large" type="submit">Login</button>
            </p>
            </form>
        """)))})),format.raw/*44.10*/("""
        
	</div>            
    </body>
</html>
    


"""))}
    }
    
    def render(form:Form[Application.Login]): play.api.templates.HtmlFormat.Appendable = apply(form)
    
    def f:((Form[Application.Login]) => play.api.templates.HtmlFormat.Appendable) = (form) => apply(form)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Dec 11 00:52:13 CET 2014
                    SOURCE: C:/playy/trello/app/views/login.scala.html
                    HASH: 746ef8bbb17ef366bab694378bb49943d9c9101a
                    MATRIX: 791->1|916->32|1058->139|1072->145|1125->177|1229->246|1243->252|1308->295|1412->364|1426->370|1484->406|1564->451|1578->457|1640->498|1734->556|1749->562|1817->608|1938->693|1953->699|2000->737|2040->739|2187->850|2220->874|2260->876|2353->933|2366->937|2408->957|2475->992|2538->1019|2576->1048|2616->1050|2710->1108|2724->1113|2761->1128|2828->1163|3035->1333|3058->1346|3087->1352|3438->1671
                    LINES: 26->1|29->1|34->6|34->6|34->6|35->7|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|39->11|39->11|39->11|44->16|44->16|44->16|44->16|49->21|49->21|49->21|51->23|51->23|51->23|53->25|55->27|55->27|55->27|57->29|57->29|57->29|59->31|62->34|62->34|62->34|72->44
                    -- GENERATED --
                */
            