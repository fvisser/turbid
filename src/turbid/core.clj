(ns turbid.core
  (:use
    compojure.core,
    ring.adapter.jetty,
    hiccup.core)
  (:require
    [hiccup.page-helpers :as page]
    [hiccup.form-helpers :as form]
    [compojure.route :as route]))

(defn display [] (html [:h1 "Hello World"] ))

(defn display2 [& name] (html [:h1 "Hello " (h (first name))]))

(defn show-form [] (html
  (doctype :html5)
  [:header [:title "Form submit"]]
  [:body
   [:h1 "Simple username form"]
   [:div.form
   (form/form-to [:POST "/form"]
     (form/label :name "Name: ")
     (form/text-field {:size "25"} :name))]]))

(defn display-result []
  (html
    [:body [:h1 "Nothing here yet"]]))

(defroutes handler
  (GET "/" [] (display ))
  (GET "/user/:id" [id] (display2 id))
  (GET "/form" [] (show-form ))
  (route/not-found "<h1>Page not found</h1>"))
