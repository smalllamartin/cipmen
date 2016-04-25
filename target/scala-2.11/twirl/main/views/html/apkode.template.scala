
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object apkode_Scope0 {
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

class apkode extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("Startup")/*2.17*/{_display_(Seq[Any](format.raw/*2.18*/("""
    """),format.raw/*3.5*/("""<div class="page-title pt-dark pt-parallax" style="background-image : url("""),_display_(/*3.80*/routes/*3.86*/.Assets.versioned("img/home/header-apkode.jpg")),format.raw/*3.133*/(""" """),format.raw/*3.134*/(""") ;" data-stellar-background-ratio="0.65">
        <span class="overlay" style="opacity :.25 ;"></span>
        <div class="container">
            <div class="inner">
                <div class="title">
                    <h2 class="text-light"><strong>APKode</strong></h2>
                </div>

            </div>
        </div>
    </div>

    <div class="container space-bottom-2x">
        <div class="row">

            <div class="col-md-3 col-sm-4 space-bottom-2x">
                <nav class="side-nav dark-skin">
                    <ul role="tablist">
                        <li class="active"><a href="#presentation" role="tab" data-toggle="tab">Présentation</a></li>
                        <li><a href="#produits" role="tab" data-toggle="tab">Produits / services</a></li>
                        <li><a href="#ask-question" class="scroll-to" data-offset-top="165">Nous contacter</a></li>
                    </ul>
                </nav>
            </div>

            <div class="col-md-9 col-sm-8">
                <div class="tab-content transparent space-bottom-2x">
                    <div role="tabpanel" class="tab-pane transition fade scale in active" id="presentation">
                        <div class="panel-group" id="accordion">
                            <div class="panel">
                                <div class="panel-heading">
                                    <a class="panel-title" data-toggle="collapse" data-parent="#accordion" href="#ac02">
                                        Qui sommes-nous ?
                                    </a>
                                </div>
                                <div id="ac02" class="panel-collapse collapse in" role="tabpanel">
                                    <div class="panel-body">
                                        <p>
                                          <strong>APKode</strong>  intervient aussi bien dans les développements de nouveaux logiciels "clés en main" que dans la reprise d'applications existantes en vue de leur évolution et de leur optimisation.
                                        </p>
                                        <p>
                                            Nos compétences et méthodes de travail nous permettent d’atteindre une clientèle diversifiée, originaire de domaines d’activités divers et variés. L’expérience que possède notre équipe nous permet d’être compétents dans tous les secteurs d’activité.
                                        </p>
                                        <p>
                                            Nos logiciels vous permettront d’atteindre les objectifs de productivité et d’amélioration des processus d’affaires que vous vous êtes fixés.
                                        </p>

                                        <p>
                                            Nous utilisons des outils de développement à la fine pointe de la technologie permettant une compatibilité sous tous les systèmes d'exploitation. Notre méthodologie de développement est inspirée de la méthodologie SCRUM afin d'assurer une solution performante répondant à vos besoins
                                        </p>

                                        <p>
                                            Notre produit phare <strong>Likitana</strong> est un logiciel de gestion de clinique, de pharmacie, et de laboratoire d'analyse.
                                        </p>
                                        <div class="embed-responsive embed-responsive-16by9 space-top-2x space-bottom-2x">
                                            <iframe src="https://www.youtube.com/embed/6wrOsOpXGdo" frameborder="0" allowfullscreen class="embed-responsive-item"></iframe>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div role="tabpanel" class="tab-pane transition fade scale" id="produits">
                        <div class="panel-group" id="accordion3">
                            <div class="panel">
                                <div class="panel-heading">
                                    <a class="panel-title collapsed" data-toggle="collapse" data-parent="#accordion3" href="#pb01">
                                        Développement logiciel
                                    </a>
                                </div>
                                <div id="pb01" class="panel-collapse collapse">
                                    <div class="panel-body">
                                        Grand Compte, PME, Start-Up, du secteur industriel, marchand, bancaire, les équipes de Timsoft vous accompagnent.<br><br>

                                        Des spécifications à la mise en production de vos projets informatiques, Timsoft vous apporte expertise, solutions et savoir-faire.

                                    </div>
                                </div>
                            </div>
                            <div class="panel">
                                <div class="panel-heading">
                                    <a class="panel-title collapsed" data-toggle="collapse" data-parent="#accordion3" href="#pb02">
                                       Développemet mobile
                                    </a>
                                </div>
                                <div id="pb02" class="panel-collapse collapse" role="tabpanel">
                                    <div class="panel-body">
                                        Nous nous sommes spécialisés dans le développement iPhone, iPad ainsi que sur le développement Android, BlackBerry et Windows Mobile, mais aussi avec des administrateurs systèmes Unix & Linux qui interviennent dans les projets qui nécessitent la mise en place et l’exploitation d’un serveur.
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>

                <div class="tile" id="ask-question">
                    <form method="post" autocomplete="off" action="contacts">
                        <h3 class="text-center">Vous voulez nous contacter ?</h3>
                        <p class="text-gray text-center"><strong>www.apkode.net</strong><br><strong>contact@apkode.net<br>+227 99 25 71 71</strong> </p>
                        <div class="row">
                            <div class="col-sm-6">
                                <div class="form-control">
                                    <i class="pe-7s-user"></i>
                                    <input type="text" placeholder="Nom" name="nom" required="required">
                                </div>
                            </div>
                            <div class="col-sm-6">
                                <div class="form-control">
                                    <i class="pe-7s-mail"></i>
                                    <input type="email" placeholder="Email" name="expediteur" required="required">
                                </div>
                            </div>
                        </div>
                        <div class="form-control">
                            <i class="pe-7s-help1"></i>
                            <textarea rows="3" placeholder="Message" name="message" required="required"></textarea>
                        </div>
                        <div class="row">
                            <div class="col-sm-6 text-right">
                                <input type="hidden" name="newsletter" value="0">
                                <input type="hidden" name="destinataire" value="contact@apkode.org">
                                <button type="submit" class="btn btn-ghost btn-primary">Envoyer</button>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object apkode extends apkode_Scope0.apkode
              /*
                  -- GENERATED --
                  DATE: Mon Apr 25 02:51:24 WAT 2016
                  SOURCE: /home/brabo/Desktop/cipmen/app/views/apkode.scala.html
                  HASH: 54ec1383a2200ec7f2a3431aa1311f468ab77c8b
                  MATRIX: 829->2|852->17|890->18|921->23|1022->98|1036->104|1104->151|1133->152
                  LINES: 32->2|32->2|32->2|33->3|33->3|33->3|33->3|33->3
                  -- GENERATED --
              */
          