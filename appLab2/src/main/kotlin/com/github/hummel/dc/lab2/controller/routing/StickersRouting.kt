package com.github.hummel.dc.lab2.controller.routing

import com.github.hummel.dc.lab2.controller.respond
import com.github.hummel.dc.lab2.dto.request.StickerRequestTo
import com.github.hummel.dc.lab2.dto.request.StickerRequestToId
import com.github.hummel.dc.lab2.service.StickerService
import com.github.hummel.dc.lab2.util.Response
import io.ktor.http.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject

fun Route.stickersRouting() {
	val stickersService by inject<StickerService>()

	route("/stickers") {
		checkStickers(stickersService)

		createSticker(stickersService)
		deleteSticker(stickersService)
		updateSticker(stickersService)
		getSticker(stickersService)
	}
}

private fun Route.checkStickers(stickersService: StickerService) {
	get {
		val stickers = stickersService.getAll()

		respond(isCorrect = {
			stickers.isNotEmpty()
		}, onCorrect = {
			call.respond(
				status = HttpStatusCode.OK, stickers
			)
		}, onIncorrect = {
			call.respond(
				status = HttpStatusCode.OK, Response(HttpStatusCode.OK.value)
			)
		})
	}
}

private fun Route.createSticker(stickersService: StickerService) {
	post {
		val stickerRequestTo = try {
			call.receive<StickerRequestTo>()
		} catch (_: Exception) {
			null
		}

		val sticker = stickersService.create(stickerRequestTo)

		respond(isCorrect = {
			sticker != null
		}, onCorrect = {
			call.respond(
				status = HttpStatusCode.Created, sticker ?: return@respond
			)
		}, onIncorrect = {
			call.respond(
				status = HttpStatusCode.BadRequest, Response(HttpStatusCode.BadRequest.value)
			)
		})
	}
}

private fun Route.getSticker(stickersService: StickerService) {
	get("/{id?}") {
		val id = call.parameters["id"] ?: return@get call.respond(
			status = HttpStatusCode.BadRequest, message = Response(HttpStatusCode.BadRequest.value)
		)

		val sticker = stickersService.getById(id.toLong())

		respond(isCorrect = {
			sticker != null
		}, onCorrect = {
			call.respond(
				status = HttpStatusCode.OK, sticker ?: return@respond
			)
		}, onIncorrect = {
			call.respond(
				status = HttpStatusCode.BadRequest, Response(HttpStatusCode.BadRequest.value)
			)
		})
	}
}

private fun Route.deleteSticker(stickersService: StickerService) {
	delete("/{id?}") {
		val id = call.parameters["id"] ?: return@delete call.respond(
			status = HttpStatusCode.BadRequest, message = Response(HttpStatusCode.BadRequest.value)
		)

		val sticker = stickersService.deleteById(id.toLong())

		respond(isCorrect = {
			sticker
		}, onCorrect = {
			call.respond(
				status = HttpStatusCode.NoContent, Response(HttpStatusCode.NoContent.value)
			)
		}, onIncorrect = {
			call.respond(
				status = HttpStatusCode.BadRequest, Response(HttpStatusCode.BadRequest.value)
			)
		})
	}
}

private fun Route.updateSticker(stickersService: StickerService) {
	put {
		val stickerRequestToId = try {
			call.receive<StickerRequestToId>()
		} catch (_: Exception) {
			null
		}

		val sticker = stickersService.update(stickerRequestToId)

		respond(isCorrect = {
			sticker != null
		}, onCorrect = {
			call.respond(
				status = HttpStatusCode.OK, sticker ?: return@respond
			)
		}, onIncorrect = {
			call.respond(
				status = HttpStatusCode.BadRequest, Response(HttpStatusCode.BadRequest.value)
			)
		})
	}
}