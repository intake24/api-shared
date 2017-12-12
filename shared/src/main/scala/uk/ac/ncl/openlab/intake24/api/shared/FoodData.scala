package uk.ac.ncl.openlab.intake24.api.data

object InheritableAttributes {
  val readyMealDefault = false
  val sameAsBeforeDefault = false
  val reasonableAmountDefault = 1000
}

case class InheritableAttributes(readyMealOption: Option[Boolean], sameAsBeforeOption: Option[Boolean], reasonableAmount: Option[Int])

case class PortionSizeMethodParameter(name: String, value: String)

case class PortionSizeMethod(method: String, description: String, imageUrl: String, useForRecipes: Boolean, parameters: Seq[PortionSizeMethodParameter])

case class AssociatedFood(foodOrCategoryCode: Either[String, String], promptText: String, linkAsMain: Boolean, genericName: String)

case class BrandName(id: Int, name: String)

case class UserFoodHeader(code: String, localDescription: String)

case class UserCategoryHeader(code: String, localDescription: String)

case class UserCategoryContents(foods: Seq[UserFoodHeader], subcategories: Seq[UserCategoryHeader])


case class AsServedHeader(id: String, description: String)



case class GuideHeader(id: String, description: String)

case class GuideImage(id: String, description: String, weights: Seq[GuideImageWeightRecord])

case class GuideImageWeightRecord(description: String, objectId: Int, weight: Double)