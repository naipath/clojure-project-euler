(ns clojure-ui-playground.core
  (:require [clojure-ui-playground.multiplesOf3And5 :refer [multiplesOf3And5]])
  (:gen-class))


(defn -main [& args]
  (println (multiplesOf3And5 1000)))
