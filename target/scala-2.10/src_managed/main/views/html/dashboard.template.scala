
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
object dashboard extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[List[Project],List[Task],User,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(projects: List[Project], todoTasks: List[Task], user: User):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.62*/("""

"""),_display_(Seq[Any](/*3.2*/main(projects, user)/*3.22*/{_display_(Seq[Any](format.raw/*3.23*/("""
    
    
    <article  class="tasks">
     
        """),_display_(Seq[Any](/*8.10*/todoTasks/*8.19*/.groupBy(_.project).map/*8.42*/ {/*9.13*/case (project, tasks) =>/*9.37*/ {_display_(Seq[Any](format.raw/*9.39*/("""
                <div class="folder" data-folder-id=""""),_display_(Seq[Any](/*10.54*/project/*10.61*/.id)),format.raw/*10.64*/("""">
                    <header>
                        <h3><a href="#"""),_display_(Seq[Any](/*12.40*/routes/*12.46*/.Tasks.index(project.id))),format.raw/*12.70*/("""">"""),_display_(Seq[Any](/*12.73*/project/*12.80*/.name)),format.raw/*12.85*/("""</a></h3>
                        <span class="loader">Loading</span>
                    </header>
                    <ul class="list">
                        """),_display_(Seq[Any](/*16.26*/tasks/*16.31*/.map/*16.35*/ { task =>_display_(Seq[Any](format.raw/*16.45*/("""
                            """),_display_(Seq[Any](/*17.30*/views/*17.35*/.html.tasks.item(task, isEditable = false))),format.raw/*17.77*/("""
                        """)))})),format.raw/*18.26*/("""
                    </ul>
                </div>
            """)))}})),format.raw/*22.10*/("""
    </article>
    
""")))})),format.raw/*25.2*/("""

"""))}
    }
    
    def render(projects:List[Project],todoTasks:List[Task],user:User): play.api.templates.HtmlFormat.Appendable = apply(projects,todoTasks,user)
    
    def f:((List[Project],List[Task],User) => play.api.templates.HtmlFormat.Appendable) = (projects,todoTasks,user) => apply(projects,todoTasks,user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Dec 11 03:26:18 CET 2014
                    SOURCE: C:/playy/trello/app/views/dashboard.scala.html
                    HASH: 10cb6f8ac88b6de04c0da5ed388d0a7b19ebac89
                    MATRIX: 801->1|955->61|992->64|1020->84|1058->85|1148->140|1165->149|1196->172|1206->187|1238->211|1277->213|1367->267|1383->274|1408->277|1515->348|1530->354|1576->378|1615->381|1631->388|1658->393|1857->556|1871->561|1884->565|1932->575|1998->605|2012->610|2076->652|2134->678|2230->751|2283->773
                    LINES: 26->1|29->1|31->3|31->3|31->3|36->8|36->8|36->8|36->9|36->9|36->9|37->10|37->10|37->10|39->12|39->12|39->12|39->12|39->12|39->12|43->16|43->16|43->16|43->16|44->17|44->17|44->17|45->18|48->22|51->25
                    -- GENERATED --
                */
            