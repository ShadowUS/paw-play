
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
object main extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[List[Project],User,Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(projects: List[Project], user: User)(body: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.51*/("""

<html>
    <head>
        <title>boards</title>
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*6.59*/routes/*6.65*/.Assets.at("images/favicon.png"))),format.raw/*6.97*/("""">
        
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*8.46*/routes/*8.52*/.Assets.at("javascripts/jquery-1.7.1.js"))),format.raw/*8.93*/(""""></script>
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*9.46*/routes/*9.52*/.Assets.at("javascripts/jquery-play-1.7.1.js"))),format.raw/*9.98*/(""""></script>
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*10.46*/routes/*10.52*/.Assets.at("javascripts/underscore-min.js"))),format.raw/*10.95*/(""""></script>
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*11.46*/routes/*11.52*/.Assets.at("javascripts/backbone-min.js"))),format.raw/*11.93*/(""""></script>
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*12.46*/routes/*12.52*/.Assets.at("javascripts/main.js"))),format.raw/*12.85*/(""""></script>
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*13.46*/routes/*13.52*/.Application.javascriptRoutes)),format.raw/*13.81*/(""""></script>
    	<link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*14.67*/routes/*14.73*/.Assets.at("stylesheets/bootstrap.min.css"))),format.raw/*14.116*/("""">
    	<link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*15.67*/routes/*15.73*/.Assets.at("stylesheets/signin.css"))),format.raw/*15.109*/("""">
    	<script type='text/javascript' src=""""),_display_(Seq[Any](/*16.43*/routes/*16.49*/.Assets.at("javascripts/bootsrap.min.js"))),format.raw/*16.90*/(""""></script>
    </head>
   <body>
    <div class="container">
       
        <header>
           <div class="btn-group-vertical">
             <dd >
                    <a class="btn btn-primary btn-large" href=""""),_display_(Seq[Any](/*24.65*/routes/*24.71*/.Application.logout())),format.raw/*24.92*/("""">Logout</a>
                </dd>
            <a class="btn btn-primary btn-large" href=""""),_display_(Seq[Any](/*26.57*/routes/*26.63*/.Projects.index)),format.raw/*26.78*/("""">Boards</a>
            <dl id="user">
                <dt class="btn btn-primary btn-large" >"""),_display_(Seq[Any](/*28.57*/user/*28.61*/.name)),format.raw/*28.66*/(""" <span>("""),_display_(Seq[Any](/*28.75*/user/*28.79*/.email)),format.raw/*28.85*/(""")</span></dt>
               
            </dl>
        	</div>
        </header>
      	
        
        <section id="main">
		<ul class="list-group"  id="projects">
               
                        """),_display_(Seq[Any](/*38.26*/views/*38.31*/.html.projects.group(projects))),format.raw/*38.61*/("""
   
               
        </ul>

        </section>
            </div>
    </body>
</html>

"""))}
    }
    
    def render(projects:List[Project],user:User,body:Html): play.api.templates.HtmlFormat.Appendable = apply(projects,user)(body)
    
    def f:((List[Project],User) => (Html) => play.api.templates.HtmlFormat.Appendable) = (projects,user) => (body) => apply(projects,user)(body)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Dec 11 02:28:26 CET 2014
                    SOURCE: C:/playy/trello/app/views/main.scala.html
                    HASH: 31eaaa0c62a063b886bea7174c90c9536202ab44
                    MATRIX: 790->1|933->50|1076->158|1090->164|1143->196|1235->253|1249->259|1311->300|1403->357|1417->363|1484->409|1577->466|1592->472|1657->515|1750->572|1765->578|1828->619|1921->676|1936->682|1991->715|2084->772|2099->778|2150->807|2264->885|2279->891|2345->934|2450->1003|2465->1009|2524->1045|2605->1090|2620->1096|2683->1137|2933->1351|2948->1357|2991->1378|3118->1469|3133->1475|3170->1490|3302->1586|3315->1590|3342->1595|3387->1604|3400->1608|3428->1614|3673->1823|3687->1828|3739->1858
                    LINES: 26->1|29->1|34->6|34->6|34->6|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|52->24|52->24|52->24|54->26|54->26|54->26|56->28|56->28|56->28|56->28|56->28|56->28|66->38|66->38|66->38
                    -- GENERATED --
                */
            