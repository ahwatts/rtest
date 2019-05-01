(set-env!
 :resource-paths #{"src" "html"}
 :dependencies '[[org.clojure/clojure "1.10.0"]
                 [org.clojure/clojurescript "1.10.520"]
                 [pandeiro/boot-http "0.8.3" :scope "test"]
                 [adzerk/boot-cljs "2.1.5" :scope "test"]
                 [reagent "0.8.1"]])

(require '[adzerk.boot-cljs :refer [cljs]]
         '[pandeiro.boot-http :refer [serve]])

(deftask dev []
  (comp (cljs :source-map true
              :optimizations :advanced
              :compiler-options {:pseudo-names true
                                 :pretty-print true}
              )
        (serve)
        (wait)))
