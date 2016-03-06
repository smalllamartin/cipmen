
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object evenement_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class evenement extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Evenement,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(evenement : Evenement):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.25*/("""

"""),_display_(/*3.2*/main("Evènement")/*3.19*/{_display_(Seq[Any](format.raw/*3.20*/("""

    """),format.raw/*5.5*/("""<div class="page-title pt-dark pt-parallax" style="background-image : url("""),_display_(/*5.80*/routes/*5.86*/.Assets.versioned("img/home/header.jpg")),format.raw/*5.126*/(""");" data-stellar-background-ratio="0.65">
        <span class="overlay" style="opacity :.25 ;"></span>
        <div class="container">
            <div class="inner">
                <div class="title">
                    <h2 class="text-light"><strong>Evènement</strong></h2>
                </div>

            </div>
        </div>
    </div>

    <div class="container space-bottom-2x">
        <div class="row">

            <div class="col-lg-9 col-md-8 col-lg-push-3 col-md-push-4">
                <h3>"""),_display_(/*21.22*/evenement/*21.31*/.getTitre),format.raw/*21.40*/("""</h3>
                <p>"""),_display_(/*22.21*/Html(evenement.getShortDescription)),format.raw/*22.56*/("""</p>
                <div class="image-carousel space-top-2x space-bottom light-controls" data-dots="true" data-autoplay="true" data-interval="3000" >
                    <div class="inner">
                        <img src=""""),_display_(/*25.36*/routes/*25.42*/.Assets.versioned("img/evenements/"+evenement.getImageOne+".jpg")),format.raw/*25.107*/("""" alt="Image">
                        <img src=""""),_display_(/*26.36*/routes/*26.42*/.Assets.versioned("img/evenements/"+evenement.getImageTwo+".jpg")),format.raw/*26.107*/("""" alt="Image">
                        <img src=""""),_display_(/*27.36*/routes/*27.42*/.Assets.versioned("img/evenements/"+evenement.getImageTree+".jpg")),format.raw/*27.108*/("""" alt="Image">
                    </div>
                </div>
                <p>"""),_display_(/*30.21*/Html(evenement.getLongDescription)),format.raw/*30.55*/("""</p>
                <div class="embed-responsive embed-responsive-16by9 space-top-2x space-bottom-2x">
                    <iframe src="https://www.youtube.com/embed/"""),_display_(/*32.65*/evenement/*32.74*/.getVideo),format.raw/*32.83*/("""" frameborder="0" allowfullscreen class="embed-responsive-item"></iframe>
                </div>
            </div>

            <div class="padding-top visible-sm visible-xs"></div>
            <div class="col-lg-3 col-md-4 col-sm-5 col-lg-pull-9 col-md-pull-8 col-sm-pull-7">
                <aside class="sidebar space-bottom">

                    <section class="widget widget_tags">
                        <h3 class="widget-title">
                            <i class="pe-7s-ticket"></i>
                            Tags
                        </h3>
                        <a href="#" class="tag">Environnement<span>5</span></a>
                        <a href="#" class="tag">Energie<span>123</span></a>
                        <a href="#" class="tag">Solaire<span>9</span></a>
                        <a href="#" class="tag">Android<span>46</span></a>
                        <a href="#" class="tag">Nature<span>77</span></a>
                        <a href="#" class="tag">Informatique<span>184</span></a>
                        <a href="#" class="tag">Development TIC<span>16</span></a>
                    </section>
                </aside>
            </div>
        </div>
    </div>

""")))}))
      }
    }
  }

  def render(evenement:Evenement): play.twirl.api.HtmlFormat.Appendable = apply(evenement)

  def f:((Evenement) => play.twirl.api.HtmlFormat.Appendable) = (evenement) => apply(evenement)

  def ref: this.type = this

}


}

/**/
object evenement extends evenement_Scope0.evenement
              /*
                  -- GENERATED --
                  DATE: Sat Mar 05 22:51:43 WAT 2016
                  SOURCE: /home/brabo/IdeaProjects/cipmen/app/views/evenement.scala.html
                  HASH: 8b4989927474874b7261b874596842a61b664822
                  MATRIX: 756->1|874->24|902->27|927->44|965->45|997->51|1098->126|1112->132|1173->172|1712->684|1730->693|1760->702|1813->728|1869->763|2122->989|2137->995|2224->1060|2301->1110|2316->1116|2403->1181|2480->1231|2495->1237|2583->1303|2695->1388|2750->1422|2945->1590|2963->1599|2993->1608
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|36->5|36->5|36->5|52->21|52->21|52->21|53->22|53->22|56->25|56->25|56->25|57->26|57->26|57->26|58->27|58->27|58->27|61->30|61->30|63->32|63->32|63->32
                  -- GENERATED --
              */
          