(ns clojure-ui-playground.largestPrimeFactor)

(defn isPrime
  ([input] (isPrime input 3))
  ([input divisor] (if (> divisor (quot input 2))
                     true
                     (if (and (integer? (/ input divisor)))
                       false
                       (recur input (inc divisor))))))

(defn findLargestPrime [possiblePrime]
  (if (even? possiblePrime)
    (findLargestPrime (dec possiblePrime))
    (if (isPrime possiblePrime)
      possiblePrime
      (findLargestPrime (- possiblePrime 2)))))

(defn largestPrimeFactor [input]
  (println "Computing the largest primefactor for:" input)
  (println "Value is:" (findLargestPrime (dec input)))
  (println))
