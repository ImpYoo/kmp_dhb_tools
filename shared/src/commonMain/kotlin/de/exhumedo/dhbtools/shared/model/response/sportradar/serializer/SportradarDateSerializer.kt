import de.exhumedo.dhbtools.shared.model.response.sportradar.common.SportradarDate
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonDecoder
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive

object SportradarDateSerializer : KSerializer<SportradarDate?> {
    override val descriptor: SerialDescriptor = SportradarDate.serializer().descriptor

    override fun deserialize(decoder: Decoder): SportradarDate? {
        val input = decoder as? JsonDecoder ?: error("Can be deserialized only by JSON")
        return when (val element = input.decodeJsonElement()) {
            is JsonObject -> input.json.decodeFromJsonElement(SportradarDate.serializer(), element)
            is JsonPrimitive -> {
                if (element.isString && element.content.isEmpty()) {
                    null
                } else {
                    error("Unexpected JSON primitive: $element")
                }
            }
            is JsonNull -> null
            else -> error("Unexpected JSON token: $element")
        }
    }

    @OptIn(ExperimentalSerializationApi::class)
    override fun serialize(encoder: Encoder, value: SportradarDate?) {
        if (value == null) {
            encoder.encodeNull()
        } else {
            encoder.encodeSerializableValue(SportradarDate.serializer(), value)
        }
    }
}