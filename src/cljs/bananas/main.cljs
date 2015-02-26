(ns bananas.main
  (:require [reagent.core :as reagent :refer [atom]])
  (:import [goog.history Html5History]
           [goog Uri]
           [goog.history EventType]))

(def state (atom 0))

(defn inc-com []
  [:div {:on-click #(swap! state inc)}
   [:h1 (str "Click " @state)]
   ])

(defn main-page []
    [:div
    [:div [inc-com]]
  ])

(defn ^:export init []
  (reagent/render-component (main-page) (.getElementById js/document "root")))
