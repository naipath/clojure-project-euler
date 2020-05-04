(ns euler.core
  (:require [euler.multiplesOf3And5 :refer [multiplesOf3And5]])
  (:require [euler.evenFibonacci :refer [evenFibonacci]])
  (:require [euler.largestPrimeFactor :refer [largestPrimeFactor]])
  (:require [euler.palindrome :refer [palindrome]])
  (:require [euler.smallestMultiple :refer [smallestMultiple]])
  (:require [euler.sumSquareDifference :refer [sumSquareDifference]])
  (:gen-class))

(defn -main [& args]
  (multiplesOf3And5 10000)
  (evenFibonacci 4000000)
  (largestPrimeFactor 600851475143)
  (palindrome 1000)
  (smallestMultiple)
  (sumSquareDifference 100)
  )
