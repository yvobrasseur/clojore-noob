(ns code-as-data)

(def code-as-string "(first [1 2 3])")

(eval
  (read-string code-as-string))

(first [1 2 3])

[1 2 3]
{:hello "world"}
(list 1 2 3)

(quote (1 2 3))

'(1 2 3)

;; functie
;; macro
;; special form

(defn foo-bar [x y z]
  (+ x y z))

(def foo-bar
  (fn [x y z]
    (+ x y z)))

(def foo-bar
  #(+ %1 %2 %3))
