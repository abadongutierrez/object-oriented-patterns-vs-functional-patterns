(ns com.jabaddon.book.fpp.roop.builder.immutable
    (:use [clojure.test])
    (:import [com.jabaddon.book.fpp.roop.builder.catsanddogs Cat NoisyCat NoiseMaker])) ;a record has to be imported

(deftest test-map
    (let [p {:first-name "John" :middle-name "Quincy" :last-name "Adams"}]
        (is (= "John" (p :first-name)))
        (is (= "Quincy" (p :middle-name)))
        (is (= "Adams" (get p :last-name)))))

(deftest test-record
    (let [r (Cat. "Calico" "Fuzzy McBootings")]
        (is (= "Fuzzy McBootings" (:name r)))
        (is (= "Calico" (get r :color)))
        (is (= "Calico" (:color r)))))

(deftest test-record-with-protocol
    (let [r (NoisyCat. "Calico" "Fuzzy McBootings")]
        (is (= "Fuzzy McBootings" (:name r)))
        (is (= "Calico" (get r :color)))
        (is (= "Fuzzy McBootingsmeows!" (.make-noise r)))))