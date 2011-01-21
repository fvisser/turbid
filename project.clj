(defproject turbid "1.0.0-SNAPSHOT"
  :description "turbid sample webapp"
  :dependencies [[org.clojure/clojure "1.2.0"]
                 [org.clojure/clojure-contrib "1.2.0"]
                 [compojure "0.5.2"]
                 [hiccup "0.3.1"]
                 [clj-time "0.3.0-SNAPSHOT"]]
  :dev-dependencies [[lein-ring "0.2.4"]
		     [swank-clojure "1.2.1"]]
  :ring {:handler turbid.core/handler})


