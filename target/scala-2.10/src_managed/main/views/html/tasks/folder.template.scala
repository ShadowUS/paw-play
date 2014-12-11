
package views.html.tasks

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
object folder extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,List[Task],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(folder: String, tasks: List[Task]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.37*/("""

<div class="folder" data-folder-id=""""),_display_(Seq[Any](/*3.38*/folder)),format.raw/*3.44*/("""">
    <header>
 		<h3>"""),_display_(Seq[Any](/*5.9*/folder)),format.raw/*5.15*/("""</h3>
        <dl class="options">
            <dt>Options</dt>
            <dd>
            <a class="deleteAllTasks btn btn-primary btn-large" href="#">Remove all tasks</a>
                <a class="deleteFolder btn btn-primary btn-large" href="#">Delete folder</a>
            </dd>
        </dl>

    </header>
    <ul class="list">
        """),_display_(Seq[Any](/*16.10*/tasks/*16.15*/.map/*16.19*/ { task =>_display_(Seq[Any](format.raw/*16.29*/("""
            """),_display_(Seq[Any](/*17.14*/views/*17.19*/.html.tasks.item( task ))),format.raw/*17.43*/("""
        """)))})),format.raw/*18.10*/("""
    </ul>
    <form class="addTask">
        <input type="hidden" name="folder" value=""""),_display_(Seq[Any](/*21.52*/folder)),format.raw/*21.58*/("""" />
        <input type="text" name="taskBody" placeholder="New task..." />
        <input type="text" name="dueDate" class="dueDate" placeholder="Due date: mm/dd/yy" />
        <input type="text" name="description" class="description" placeholder="description" />
        <div class="assignedTo">
            <input type="text" name="assignedTo" placeholder="Assign to..." />
        </div>
        <input class="btn btn-primary btn-large" type="submit" />
    </form>
</div>

"""))}
    }
    
    def render(folder:String,tasks:List[Task]): play.api.templates.HtmlFormat.Appendable = apply(folder,tasks)
    
    def f:((String,List[Task]) => play.api.templates.HtmlFormat.Appendable) = (folder,tasks) => apply(folder,tasks)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Dec 11 03:09:11 CET 2014
                    SOURCE: C:/playy/trello/app/views/tasks/folder.scala.html
                    HASH: bb5703a9aa73ec886c765285877e473013ca1d34
                    MATRIX: 792->1|921->36|995->75|1022->81|1080->105|1107->111|1489->457|1503->462|1516->466|1564->476|1614->490|1628->495|1674->519|1716->529|1841->618|1869->624
                    LINES: 26->1|29->1|31->3|31->3|33->5|33->5|44->16|44->16|44->16|44->16|45->17|45->17|45->17|46->18|49->21|49->21
                    -- GENERATED --
                */
            