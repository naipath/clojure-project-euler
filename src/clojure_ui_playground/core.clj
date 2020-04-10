(ns clojure-ui-playground.core
  (:require [clojure-ui-playground.multiplesOf3And5 :refer [multiplesOf3And5]])
  (:require [clojure-ui-playground.evenFibonacci :refer [evenFibonacci]])
  (:gen-class))

(defn -main [& args]
  (multiplesOf3And5 10000)
  (evenFibonacci 4000000))
