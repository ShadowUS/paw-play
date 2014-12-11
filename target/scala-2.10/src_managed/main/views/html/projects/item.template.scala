
package views.html.projects

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
object item extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Project,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(project: Project):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.20*/("""

<li data-project=""""),_display_(Seq[Any](/*3.20*/project/*3.27*/.id)),format.raw/*3.30*/("""">
    <a class="name list-group-item btn-default btn" href="#"""),_display_(Seq[Any](/*4.61*/routes/*4.67*/.Tasks.index(project.id))),format.raw/*4.91*/("""">"""),_display_(Seq[Any](/*4.94*/project/*4.101*/.name)),format.raw/*4.106*/("""</a>
    
</li>
"""))}
    }
    
    def render(project:Project): play.api.templates.HtmlFormat.Appendable = apply(project)
    
    def f:((Project) => play.api.templates.HtmlFormat.Appendable) = (project) => apply(project)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Dec 11 02:53:03 CET 2014
                    SOURCE: C:/playy/trello/app/views/projects/item.scala.html
                    HASH: cd15d3c2049c592021d357b5e08ca923f819e489
                    MATRIX: 783->1|895->19|951->40|966->47|990->50|1088->113|1102->119|1147->143|1185->146|1201->153|1228->158
                    LINES: 26->1|29->1|31->3|31->3|31->3|32->4|32->4|32->4|32->4|32->4|32->4
                    -- GENERATED --
                */
            