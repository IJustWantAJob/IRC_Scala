// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers {

  // @LINE:6
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def at(path:String, image:String): Call = {
    
      (path: @unchecked, image: @unchecked) match {
      
        // @LINE:6
        case (path, image) if path == "/public/images" =>
          implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public/images"))); _rrc
          Call("GET", _prefix + { _defaultPrefix } + "images/" + implicitly[play.api.mvc.PathBindable[String]].unbind("image", image))
      
        // @LINE:9
        case (path, image) if path == "/public" =>
          implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
          Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[String]].unbind("file", image))
      
      }
    
    }
  
  }


}
