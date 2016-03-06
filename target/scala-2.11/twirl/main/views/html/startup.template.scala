
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object startup_Scope0 {
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

class startup extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("Startup")/*2.17*/{_display_(Seq[Any](format.raw/*2.18*/("""
    """),format.raw/*3.5*/("""<div class="page-title pt-dark pt-parallax" style="background-image : url("""),_display_(/*3.80*/routes/*3.86*/.Assets.versioned("img/home/header.jpg")),format.raw/*3.126*/(""");" data-stellar-background-ratio="0.65">
        <span class="overlay" style="opacity :.25 ;"></span>
        <div class="container">
            <div class="inner">
                <div class="title">
                    <h2 class="text-light"><strong>Stratetic</strong></h2>
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
                                        Plus qu’une <strong>STRATETIC</strong> est un Cabinet de Conseil, d’étude et de formation spécialisé dans le domaine de la Communication, des Médias et des Nouvelles Technologies.<br><br> <strong>STRATETIC</strong> L’agence créative au service de votre communication.
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
                                        Réalisation Video
                                    </a>
                                </div>
                                <div id="pb01" class="panel-collapse collapse">
                                    <div class="panel-body">
                                        Production audiovisuel , Film institutionnel ou corporate, artistique, spot publicitaire, documentaires.
                                    </div>
                                </div>
                            </div>
                            <div class="panel">
                                <div class="panel-heading">
                                    <a class="panel-title collapsed" data-toggle="collapse" data-parent="#accordion3" href="#pb02">
                                        stratégie marketing & digitale
                                    </a>
                                </div>
                                <div id="pb02" class="panel-collapse collapse" role="tabpanel">
                                    <div class="panel-body">
                                        Création de sites internet vitrines, e-commerce & mobiles développement & CMS, campagnes e-mailing, référencement & visibilité, social média & réseaux sociaux
                                    </div>
                                </div>
                            </div>
                            <div class="panel">
                                <div class="panel-heading">
                                    <a class="panel-title collapsed" data-toggle="collapse" data-parent="#accordion3" href="#pb03">
                                        Art Graphique & Branding
                                    </a>
                                </div>
                                <div id="pb03" class="panel-collapse collapse">
                                    <div class="panel-body">
                                        Pour créer une charte graphique à la hauteur de votre emblème et une identité visuelle à l'image de votre marque.<br> Nous sommes votre partenaire idéal pour vos annonces Presse, Affichage, Signalétique, Brochure, magazine, dépliant...
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>

                <div class="tile" id="ask-question">
                    <form method="post" autocomplete="off" action="contacts">
                        <h3 class="text-center">Vous voulez nous contacter ?</h3>
                        <p class="text-gray text-center"><strong>contact@stratetic.fr<br>+227 90 22 22 22</strong> </p>
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
                                <input type="hidden" name="destinataire" value="contact@stratetic.org">
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
object startup extends startup_Scope0.startup
              /*
                  -- GENERATED --
                  DATE: Sat Mar 05 23:24:16 WAT 2016
                  SOURCE: /home/brabo/IdeaProjects/cipmen/app/views/startup.scala.html
                  HASH: 491e4ecc53ae73507f87a3829be0b8e1a888d83b
                  MATRIX: 831->2|854->17|892->18|923->23|1024->98|1038->104|1099->144
                  LINES: 32->2|32->2|32->2|33->3|33->3|33->3|33->3
                  -- GENERATED --
              */
          