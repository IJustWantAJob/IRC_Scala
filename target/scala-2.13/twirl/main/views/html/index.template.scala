
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,org.webjars.play.WebJarsUtil,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(webSocketUrl: String)(implicit webJarsUtil: org.webjars.play.WebJarsUtil):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        """),_display_(/*9.10*/webJarsUtil/*9.21*/.locate("bootstrap.min.css").css()),format.raw/*9.55*/("""
        """),_display_(/*10.10*/webJarsUtil/*10.21*/.locate("bootstrap-theme.min.css").css()),format.raw/*10.61*/("""

        """),format.raw/*12.9*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*12.54*/routes/*12.60*/.Assets.at("stylesheets/main.css")),format.raw/*12.94*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*13.59*/routes/*13.65*/.Assets.at("images/favicon.png")),format.raw/*13.97*/("""">
        <title>Hangout zone for reminders and notes</title>

    </head>

    <body>
        <div class="wrap">
            <div class="container-fluid">
                <div>
                    <h1 class="">Hangout zone for reminders and notes</h1>
                </div>

                <div class="row">
                    <div class="col-lg-12">
                        <ul id="messages" class="list-unstyled">
                        </ul>
                    </div>
                </div>
            </div>
        </div>

        <div class="footer navbar-fixed-bottom">
            <div class="row">
                <div class="col-xs-8 col-sm-9">
                    <input id="message" placeholder="Type Here" type="text"
                      autofocus
                      autocomplete="off" spellcheck="false" autocorrect="off"
                      class="form-control input-lg" />
                </div>

                <div class="col-xs-4 col-sm-3">
                    <button id="send" type="submit" class="btn btn-primary btn-lg btn-block">Send</button>
                </div>
            </div>
        </div>

        """),_display_(/*49.10*/webJarsUtil/*49.21*/.locate("jquery.min.js").script()),format.raw/*49.54*/("""
        """),_display_(/*50.10*/webJarsUtil/*50.21*/.locate("jquery.flot.min.js").script()),format.raw/*50.59*/("""
        """),format.raw/*51.9*/("""<script type='text/javascript' src='"""),_display_(/*51.46*/routes/*51.52*/.Assets.at("javascripts/modernizr-3.5.0.js")),format.raw/*51.96*/("""'></script>
        <script type='text/javascript' src='"""),_display_(/*52.46*/routes/*52.52*/.Assets.at("javascripts/app.js")),format.raw/*52.84*/("""' data-url='"""),_display_(/*52.97*/webSocketUrl),format.raw/*52.109*/("""'></script>

    </body>

</html>"""))
      }
    }
  }

  def render(webSocketUrl:String,webJarsUtil:org.webjars.play.WebJarsUtil): play.twirl.api.HtmlFormat.Appendable = apply(webSocketUrl)(webJarsUtil)

  def f:((String) => (org.webjars.play.WebJarsUtil) => play.twirl.api.HtmlFormat.Appendable) = (webSocketUrl) => (webJarsUtil) => apply(webSocketUrl)(webJarsUtil)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/index.scala.html
                  HASH: 3c0ab5678e6f7606ee7beb3c8e3f369e200e94ca
                  MATRIX: 758->1|926->76|1176->300|1195->311|1249->345|1286->355|1306->366|1367->406|1404->416|1476->461|1491->467|1546->501|1634->562|1649->568|1702->600|2879->1750|2899->1761|2953->1794|2990->1804|3010->1815|3069->1853|3105->1862|3169->1899|3184->1905|3249->1949|3333->2006|3348->2012|3401->2044|3441->2057|3475->2069
                  LINES: 21->1|26->2|33->9|33->9|33->9|34->10|34->10|34->10|36->12|36->12|36->12|36->12|37->13|37->13|37->13|73->49|73->49|73->49|74->50|74->50|74->50|75->51|75->51|75->51|75->51|76->52|76->52|76->52|76->52|76->52
                  -- GENERATED --
              */
          