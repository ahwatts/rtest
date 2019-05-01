(ns rtest.core
  (:require [reagent.core :as r]))

(enable-console-print!)

(defn hello-comp []
  [:div
   [:p "Hello, World"]])

(defn main []
  (println "Hello, World!")
  (r/render hello-comp (.getElementById js/document "app")))
